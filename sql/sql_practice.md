# SQL Practice Workbook (PostgreSQL)

A single, self-contained set of exercises for the `testdb` schema below, written for **PostgreSQL**.
Organized by topic and difficulty, with the question phrased plainly first and the query
underneath. Open this in IntelliJ (with the Database plugin) against a Postgres instance and run
sections top to bottom.

> A few queries from the original MySQL notes had logic bugs — those are fixed here, with a short
> note. Several new topics were added at the end that are either missing pieces (window
> functions, recursive CTEs) or genuinely Postgres-flavored things worth knowing (`UPSERT`,
> set operations, `JSONB`, sequences, `CASE`/null handling).

---

## 0. Schema & Sample Data

```sql
CREATE DATABASE testdb;
\c testdb

-- Departments
CREATE TABLE departments (
    dept_id     INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    department  VARCHAR(255) NOT NULL,
    location    VARCHAR(255)
);

-- Employees
CREATE TABLE employees (
    emp_id      INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    dept_id     INT NOT NULL REFERENCES departments(dept_id),
    salary      DECIMAL(10, 2) CHECK (salary > 0),
    hire_date   DATE NOT NULL
);

-- Projects
CREATE TABLE projects (
    project_id    INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    project_name  VARCHAR(255) NOT NULL,
    dept_id       INT NOT NULL REFERENCES departments(dept_id),
    budget        DECIMAL(10, 2) NOT NULL CHECK (budget > 0)
);

-- Assignments (Employee <-> Project, many-to-many)
CREATE TABLE assignments (
    assign_id   INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    emp_id      INT NOT NULL REFERENCES employees(emp_id),
    project_id  INT NOT NULL REFERENCES projects(project_id)
);
```

> `GENERATED ALWAYS AS IDENTITY` is the modern, SQL-standard replacement for MySQL's
> `AUTO_INCREMENT`. You'll also see the older `SERIAL` pseudo-type in the wild (`dept_id SERIAL
> PRIMARY KEY`) — it does the same thing but `IDENTITY` is what Postgres itself now recommends.

```sql
-- Departments
INSERT INTO departments (department, location) VALUES
('Sales', 'New York'), ('HR', 'San Francisco'), ('IT', 'Chicago'),
('Marketing', 'Los Angeles'), ('Finance', 'Boston'),
('Operations', 'Dallas'), ('Legal', 'Seattle'), ('R&D', 'Austin'),
('Customer Service', 'Atlanta'), ('Logistics', 'Phoenix');

-- Employees
INSERT INTO employees (name, dept_id, salary, hire_date) VALUES
('John Doe', 1, 55000, '2018-01-15'),
('Jane Smith', 2, 62000, '2019-03-22'),
('Alice Johnson', 3, 72000, '2020-07-10'),
('Bob Brown', 1, 45000, '2017-08-19'),
('Charlie Davis', 3, 80000, '2021-05-05'),
('Emma Watson', 4, 50000, '2019-09-12'),
('David Lee', 5, 90000, '2020-11-30'),
('Sophia Green', 2, 70000, '2018-06-18'),
('Liam White', 1, 60000, '2022-02-10'),
('Olivia Harris', 4, 54000, '2021-07-07'),
('Michael Scott', 6, 75000, '2016-05-23'),
('Pam Beesly', 7, 52000, '2018-02-18'),
('Jim Halpert', 8, 65000, '2017-04-12'),
('Dwight Schrute', 1, 58000, '2015-09-09'),
('Angela Martin', 9, 62000, '2019-11-03'),
('Oscar Martinez', 5, 72000, '2021-06-01'),
('Kevin Malone', 6, 48000, '2020-08-15'),
('Stanley Hudson', 4, 54000, '2021-10-22'),
('Creed Bratton', 10, 50000, '2017-01-05'),
('Kelly Kapoor', 7, 62000, '2020-07-25');

-- Projects
INSERT INTO projects (project_name, dept_id, budget) VALUES
('Project Alpha', 1, 500000), ('Project Beta', 2, 300000), ('Project Gamma', 3, 400000),
('Project Delta', 4, 250000), ('Project Epsilon', 5, 450000), ('Project Zeta', 3, 600000),
('Project Eta', 1, 320000), ('Project Theta', 4, 200000), ('Project Iota', 2, 150000),
('Project Kappa', 5, 550000), ('Project Omega', 6, 600000), ('Project Sigma', 7, 250000),
('Project Lambda', 8, 750000), ('Project Rho', 9, 400000), ('Project Chi', 10, 100000),
('Project Psi', 4, 320000), ('Project Nu', 1, 500000), ('Project Xi', 2, 350000),
('Project Omicron', 5, 900000), ('Project Tau', 6, 450000);

-- Assignments
INSERT INTO assignments (emp_id, project_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 1), (5, 3), (6, 4), (7, 5), (8, 2), (9, 1), (10, 4),
(11, 11), (12, 12), (13, 13), (14, 1), (15, 14), (16, 15), (17, 16), (18, 4),
(19, 17), (20, 18), (3, 3), (6, 4), (7, 5), (9, 6), (10, 7), (8, 8), (12, 9),
(15, 10), (14, 19), (13, 20);
```

---

## 1. Basic SELECT & Filtering

**Q1. Show every column and row in `employees`.**
```sql
SELECT * FROM employees;
```

**Q2. Show only the name and salary columns.**
```sql
SELECT name, salary FROM employees;
```

**Q3. Names and salaries of everyone in the Marketing department.**
```sql
SELECT e.name, e.salary
FROM employees e
WHERE e.dept_id = (SELECT d.dept_id FROM departments d WHERE d.department = 'Marketing');
```

**Q4. Employees hired after 2020-01-01.**
```sql
SELECT e.name FROM employees e WHERE e.hire_date > DATE '2020-01-01';
```

**Q5. All departments, alphabetically.**
```sql
SELECT * FROM departments ORDER BY department;
```

**Q6. Every project's name and budget.**
```sql
SELECT project_name, budget FROM projects;
```

**Q7. Employees earning more than 60,000.**
```sql
SELECT * FROM employees WHERE salary > 60000;
```

**Q8. Employees earning between 60,000 and 80,000.**
```sql
SELECT * FROM employees WHERE salary BETWEEN 60000 AND 80000;
```

**Q9. Employees in either Sales or IT.**
```sql
SELECT * FROM employees e
WHERE e.dept_id IN (SELECT d.dept_id FROM departments d WHERE d.department IN ('IT', 'Sales'));
```

**Q10. Number of employees per department.**
```sql
SELECT dept_id, COUNT(*) FROM employees GROUP BY dept_id;
```

**Q11. Department name + location for each department.**
```sql
SELECT department, location FROM departments;
```

**Q12. Employees whose name starts with "J".**
```sql
SELECT * FROM employees WHERE name LIKE 'J%';
```

**Q13. The single highest-paid employee.**
```sql
SELECT * FROM employees ORDER BY salary DESC LIMIT 1;
```

**Q14. Every distinct department row.**
```sql
SELECT DISTINCT * FROM departments;
```

**Q15. Top 3 highest-paid employees.**
```sql
SELECT * FROM employees ORDER BY salary DESC LIMIT 3;
```

**Q16. 5 cheapest projects by budget.**
```sql
SELECT * FROM projects ORDER BY budget LIMIT 5;
```

---

## 2. Joins

**Q17. Employee names with their department names (INNER JOIN).**
```sql
SELECT e.name, d.department
FROM employees e JOIN departments d ON e.dept_id = d.dept_id;
```

**Q18. Every project with the location of the department that owns it.**
```sql
SELECT p.project_name, d.department, d.location
FROM projects p JOIN departments d ON p.dept_id = d.dept_id;
```

**Q19. Every department with its employees, including departments that have none (LEFT JOIN).**
```sql
SELECT * FROM departments d LEFT JOIN employees e ON d.dept_id = e.dept_id;
```

**Q20. Every department with its projects, including departments with none (LEFT JOIN).**
```sql
SELECT * FROM departments d LEFT JOIN projects p ON d.dept_id = p.dept_id;
```

**Q21. Every employee paired with every project in their own department (CROSS JOIN, filtered).**
> A true `CROSS JOIN` has no `ON` clause and produces the full cartesian product; adding a
> condition like this is really an inner join written with `CROSS JOIN` syntax. Shown both ways:
```sql
-- True cross join: every employee x every project (no relationship required)
SELECT * FROM employees CROSS JOIN projects;

-- Employee x project, same department only
SELECT * FROM employees e JOIN projects p ON e.dept_id = p.dept_id;
```

**Q22. For each department, find employees who earn more than another employee in the same department (SELF JOIN).**
```sql
SELECT e1.name AS employee_name, e1.salary,
       e2.name AS compared_employee, e2.salary AS compared_salary,
       d.department
FROM employees e1
JOIN employees e2 ON e1.dept_id = e2.dept_id AND e1.salary > e2.salary
JOIN departments d ON e1.dept_id = d.dept_id
ORDER BY d.department, e1.salary DESC;
```

**Q23. Department name for each employee in Chicago.**
```sql
SELECT e.* FROM employees e
WHERE e.dept_id IN (SELECT d.dept_id FROM departments d WHERE d.location = 'Chicago');
```

**Q24. Employee name, department name, and project name — all together.**
```sql
SELECT e.name, d.department, STRING_AGG(p.project_name, ', ') AS projects
FROM employees e
JOIN departments d ON e.dept_id = d.dept_id
LEFT JOIN assignments a ON a.emp_id = e.emp_id
LEFT JOIN projects p ON p.project_id = a.project_id
GROUP BY e.emp_id, d.department;
```

---

## 3. Aggregates & Grouping

**Q25. Average salary per department.**
```sql
SELECT d.department, AVG(e.salary) AS avg_salary
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department;
```

**Q26. Total salary bill per department.**
```sql
SELECT d.department, SUM(e.salary) AS total_salary
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department;
```

**Q27. Departments where the total salary bill exceeds 200,000.**
```sql
SELECT d.department, SUM(e.salary) AS total_salary
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department
HAVING SUM(e.salary) > 200000;
```

**Q28. Departments with more than 3 employees.**
```sql
SELECT d.department, COUNT(*) AS emp_count
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department
HAVING COUNT(*) > 3;
```

**Q29. Total budget allocated to each department's projects.**
```sql
SELECT d.department, SUM(p.budget) AS total_budget
FROM projects p JOIN departments d ON p.dept_id = d.dept_id
GROUP BY d.dept_id, d.department;
```

**Q30. Number of projects with budget over 400,000.**
```sql
SELECT COUNT(*) AS total_projects FROM projects WHERE budget > 400000;
```

**Q31. Average budget across all projects.**
```sql
SELECT AVG(budget) FROM projects;
```

**Q32. Min and max salary within each department.**
```sql
SELECT d.department, MIN(e.salary) AS min_salary, MAX(e.salary) AS max_salary
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department;
```

**Q33. The single project with the highest budget.**
```sql
SELECT project_name, budget FROM projects ORDER BY budget DESC LIMIT 1;
```

**Q34. Departments with more than 2 projects.**
```sql
SELECT d.department, COUNT(*) AS project_count
FROM projects p JOIN departments d ON p.dept_id = d.dept_id
GROUP BY d.dept_id, d.department
HAVING COUNT(*) > 2;
```

**Q35. Concatenate every employee's name into one comma-separated string.**
> MySQL's `GROUP_CONCAT(col SEPARATOR ', ')` becomes Postgres's `STRING_AGG(col, ', ')`.
```sql
SELECT STRING_AGG(name, ', ') AS employee_names FROM employees;
```

---

## 4. Subqueries

**Q36. Employees earning more than the company-wide average salary.**
```sql
SELECT * FROM employees WHERE salary > (SELECT AVG(salary) FROM employees);
```

**Q37. Employees earning more than *their own department's* average salary.**
> Original notes compared salary to `AVG(projects.budget)` — that compares salary to budget,
> which isn't meaningful. Correct version compares against department salary average:
```sql
SELECT e.* FROM employees e
WHERE e.salary > (SELECT AVG(e2.salary) FROM employees e2 WHERE e2.dept_id = e.dept_id);
```

**Q38. Projects with a budget above the overall average project budget.**
```sql
SELECT * FROM projects WHERE budget > (SELECT AVG(budget) FROM projects);
```

**Q39. Projects within 20% of the average project budget (i.e., between 80% and 120% of it).**
> Original only checked the lower bound and used the wrong arithmetic. Fixed version checks a
> proper range:
```sql
SELECT * FROM projects
WHERE budget BETWEEN (SELECT AVG(budget) * 0.8 FROM projects)
                  AND (SELECT AVG(budget) * 1.2 FROM projects);
```

**Q40. Employees who work in the same department as David Lee.**
```sql
SELECT * FROM employees
WHERE dept_id = (SELECT dept_id FROM employees WHERE name = 'David Lee');
```

**Q41. Employees who are not assigned to any project.**
> Original filtered on department membership, which isn't the same thing as "no project
> assignment." Correct version checks the `assignments` table directly:
```sql
SELECT e.* FROM employees e
WHERE e.emp_id NOT IN (SELECT a.emp_id FROM assignments a);
```

**Q42. Departments that have no employees.**
```sql
SELECT * FROM departments d
WHERE d.dept_id NOT IN (SELECT DISTINCT dept_id FROM employees);
```

**Q43. Departments managing projects with a combined budget over 1,000,000.**
```sql
SELECT d.department
FROM departments d
WHERE d.dept_id IN (
    SELECT p.dept_id FROM projects p GROUP BY p.dept_id HAVING SUM(p.budget) > 1000000
);
```

**Q44. Total project budget per employee's department, shown next to each employee (correlated subquery).**
```sql
SELECT e.name, (SELECT SUM(p.budget) FROM projects p WHERE p.dept_id = e.dept_id) AS dept_total_budget
FROM employees e;
```

---

## 5. Sorting, Ranking & "Nth highest"

**Q45. All employees sorted by salary, highest first.**
```sql
SELECT * FROM employees ORDER BY salary DESC;
```

**Q46. All employees sorted by hire date, earliest first.**
```sql
SELECT * FROM employees ORDER BY hire_date;
```

**Q47. Employees hired in 2019 or later, most recent first.**
```sql
SELECT * FROM employees WHERE hire_date >= DATE '2019-01-01' ORDER BY hire_date DESC;
```

**Q48. Employees who've been with the company more than 5 years (relative to today).**
```sql
SELECT * FROM employees WHERE hire_date <= CURRENT_DATE - INTERVAL '5 years';
```

**Q49. Second-highest salary in the company.**
```sql
SELECT * FROM employees ORDER BY salary DESC LIMIT 1 OFFSET 1;
```

**Q50. Third-highest salary in the company.**
```sql
SELECT * FROM employees ORDER BY salary DESC LIMIT 1 OFFSET 2;
```

**Q51. Total salary paid out, grouped by the year each employee was hired.**
> MySQL's `YEAR(col)` becomes `EXTRACT(YEAR FROM col)` in Postgres.
```sql
SELECT EXTRACT(YEAR FROM hire_date) AS hire_year, SUM(salary) AS total_salary
FROM employees
GROUP BY hire_year;
```

**Q52. The department with the most employees.**
```sql
SELECT d.dept_id, d.department
FROM departments d
WHERE d.dept_id = (
    SELECT e.dept_id FROM employees e GROUP BY e.dept_id ORDER BY COUNT(*) DESC LIMIT 1
);
```

**Q53. The employee with the longest tenure in each department.**
```sql
SELECT e.*
FROM employees e
WHERE e.hire_date = (
    SELECT MIN(e2.hire_date) FROM employees e2 WHERE e2.dept_id = e.dept_id
);
```

---

## 6. Projects ↔ Employees relationships

**Q54. Employees who work on more than one project.**
> Original query actually grouped by *department* project counts and mislabeled it as
> "employees on multiple projects." Corrected version uses the `assignments` table:
```sql
SELECT e.name, COUNT(*) AS project_count
FROM employees e JOIN assignments a ON a.emp_id = e.emp_id
GROUP BY e.emp_id, e.name
HAVING COUNT(*) > 1;
```

**Q55. Number of employees working in each project's department.**
```sql
SELECT p.project_name, COUNT(DISTINCT e.emp_id) AS employees_in_dept
FROM projects p JOIN employees e ON e.dept_id = p.dept_id
GROUP BY p.project_id, p.project_name;
```

**Q56. Total salary of the department behind each project, plus who they are.**
```sql
SELECT p.project_name, SUM(e.salary) AS dept_salary_total,
       STRING_AGG(e.name, ', ') AS employees
FROM projects p JOIN employees e ON e.dept_id = p.dept_id
GROUP BY p.project_id, p.project_name;
```

**Q57. Employees who've worked on projects belonging to more than one department (via `assignments`).**
```sql
SELECT e.name, COUNT(DISTINCT p.dept_id) AS distinct_depts
FROM employees e
JOIN assignments a ON a.emp_id = e.emp_id
JOIN projects p ON p.project_id = a.project_id
GROUP BY e.emp_id, e.name
HAVING COUNT(DISTINCT p.dept_id) > 1;
```

**Q58. Each project's name and the number of people actually assigned to it (via `assignments`, including zero).**
```sql
SELECT p.project_name, COUNT(a.emp_id) AS assigned_employees
FROM projects p LEFT JOIN assignments a ON a.project_id = p.project_id
GROUP BY p.project_id, p.project_name;
```

**Q59. Every employee with their project count, including employees with zero projects.**
```sql
SELECT e.name, COUNT(a.project_id) AS project_count
FROM employees e LEFT JOIN assignments a ON a.emp_id = e.emp_id
GROUP BY e.emp_id, e.name;
```

**Q60. Difference between each project's budget and the total salary of its owning department.**
```sql
SELECT p.project_name, p.budget, dept_totals.total_salary,
       p.budget - dept_totals.total_salary AS budget_minus_salary
FROM projects p
JOIN (SELECT dept_id, SUM(salary) AS total_salary FROM employees GROUP BY dept_id) dept_totals
  ON dept_totals.dept_id = p.dept_id;
```

**Q61. Departments where the combined project budget is over 10% higher than the company-wide average project budget.**
```sql
SELECT d.department, SUM(p.budget) AS dept_total, avg_all.company_avg
FROM projects p
JOIN departments d ON d.dept_id = p.dept_id
CROSS JOIN (SELECT AVG(budget) AS company_avg FROM projects) avg_all
GROUP BY d.dept_id, d.department, avg_all.company_avg
HAVING SUM(p.budget) > avg_all.company_avg * 1.1;
```

**Q62. The department with the lowest total salary expense.**
```sql
SELECT d.department, SUM(e.salary) AS total_salary
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department
ORDER BY total_salary ASC
LIMIT 1;
```

**Q63. Top 5 departments by average salary.**
```sql
SELECT d.department, AVG(e.salary) AS avg_salary
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
GROUP BY d.dept_id, d.department
ORDER BY avg_salary DESC
LIMIT 5;
```

**Q64. Pivot table: number of projects per department, one row per department.**
> Postgres has no native `PIVOT` either; simulate it with conditional aggregation (`FILTER` or
> `CASE`) when you know the columns in advance, or just use a plain `GROUP BY` when you don't:
```sql
-- Plain group-by version
SELECT d.department, COUNT(p.project_id) AS total_projects
FROM departments d LEFT JOIN projects p ON p.dept_id = d.dept_id
GROUP BY d.dept_id, d.department;

-- "Pivoted" version using FILTER — one column per named department
SELECT
    COUNT(*) FILTER (WHERE d.department = 'Sales')     AS sales_projects,
    COUNT(*) FILTER (WHERE d.department = 'IT')        AS it_projects,
    COUNT(*) FILTER (WHERE d.department = 'Marketing') AS marketing_projects
FROM projects p JOIN departments d ON p.dept_id = d.dept_id;
```

---

## 7. Window Functions

Window functions let you rank/aggregate over a "window" of rows without collapsing them into
one row per group, unlike `GROUP BY`.

**Q65. Rank employees by salary within their own department.**
```sql
SELECT name, dept_id, salary,
       RANK() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS salary_rank
FROM employees;
```

**Q66. Same as above, but without gaps in the ranking (`DENSE_RANK`) vs. a plain row counter (`ROW_NUMBER`).**
```sql
SELECT name, dept_id, salary,
       RANK()       OVER (PARTITION BY dept_id ORDER BY salary DESC) AS rnk,
       DENSE_RANK() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS dense_rnk,
       ROW_NUMBER() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS row_num
FROM employees;
```

**Q67. Running (cumulative) total of salary, ordered by hire date.**
```sql
SELECT name, hire_date, salary,
       SUM(salary) OVER (ORDER BY hire_date) AS cumulative_salary
FROM employees;
```

**Q68. Each employee's salary next to their department's average, without collapsing rows.**
```sql
SELECT name, dept_id, salary,
       AVG(salary) OVER (PARTITION BY dept_id) AS dept_avg_salary
FROM employees;
```

**Q69. Top-paid employee per department using a window function (instead of a correlated subquery).**
```sql
SELECT * FROM (
    SELECT e.*, RANK() OVER (PARTITION BY dept_id ORDER BY salary DESC) AS rnk
    FROM employees e
) ranked
WHERE rnk = 1;
```

**Q70. Each employee compared to the previous/next hire in the whole company (`LAG`/`LEAD`).**
```sql
SELECT name, hire_date,
       LAG(name)  OVER (ORDER BY hire_date) AS hired_before,
       LEAD(name) OVER (ORDER BY hire_date) AS hired_after
FROM employees;
```

---

## 8. Recursive CTE

The current schema has no manager relationship, so a management hierarchy can't be queried yet.
To practice this, add a self-referencing column first:

```sql
ALTER TABLE employees ADD COLUMN manager_id INT REFERENCES employees(emp_id);

-- Example: make emp_id 1 (John Doe) the manager of a few others
UPDATE employees SET manager_id = 1 WHERE emp_id IN (4, 9, 14);
```

**Q71. Walk the management chain starting from a given top-level manager.**
```sql
WITH RECURSIVE org_chart AS (
    SELECT emp_id, name, manager_id, 1 AS level
    FROM employees
    WHERE emp_id = 1                -- start: the top manager

    UNION ALL

    SELECT e.emp_id, e.name, e.manager_id, oc.level + 1
    FROM employees e
    JOIN org_chart oc ON e.manager_id = oc.emp_id
)
SELECT * FROM org_chart ORDER BY level;
```

---

## 9. Basic CTE

A CTE (`WITH ... AS (...)`) is a named, temporary result set scoped to one statement — mainly
used to break a complex query into readable steps.

```sql
WITH dept_salary AS (
    SELECT dept_id, SUM(salary) AS total_salary
    FROM employees
    GROUP BY dept_id
)
SELECT d.department, ds.total_salary
FROM dept_salary ds
JOIN departments d ON d.dept_id = ds.dept_id
ORDER BY ds.total_salary DESC;
```

---

## 10. CASE Expressions & NULL Handling *(new)*

**Q72. Label employees as "Senior" (5+ years tenure) or "Junior" using `CASE`.**
```sql
SELECT name, hire_date,
       CASE
           WHEN hire_date <= CURRENT_DATE - INTERVAL '5 years' THEN 'Senior'
           ELSE 'Junior'
       END AS seniority
FROM employees;
```

**Q73. Show a department's location, or "Unknown" if it was never set (`COALESCE`).**
```sql
SELECT department, COALESCE(location, 'Unknown') AS location
FROM departments;
```

**Q74. `NULLIF` — turn a specific sentinel value into a real `NULL` (e.g. treat a budget of 0 as "not set").**
```sql
SELECT project_name, NULLIF(budget, 0) AS budget
FROM projects;
```

---

## 11. Set Operations *(new)*

`UNION` / `INTERSECT` / `EXCEPT` combine the results of two queries with the same column shape.
`UNION` removes duplicates by default; `UNION ALL` keeps them (and is faster).

**Q75. A single list of every department name and every project name, no duplicates.**
```sql
SELECT department AS name FROM departments
UNION
SELECT project_name AS name FROM projects;
```

**Q76. Department IDs that have both employees and projects (`INTERSECT`).**
```sql
SELECT dept_id FROM employees
INTERSECT
SELECT dept_id FROM projects;
```

**Q77. Department IDs that have employees but no projects (`EXCEPT`).**
```sql
SELECT dept_id FROM employees
EXCEPT
SELECT dept_id FROM projects;
```

---

## 12. Upsert: `INSERT ... ON CONFLICT` *(new, Postgres-specific)*

Postgres's answer to "insert, but update if it already exists" (MySQL calls this
`ON DUPLICATE KEY UPDATE`).

```sql
-- Requires a uniqueness constraint to detect the "conflict" against
ALTER TABLE departments ADD CONSTRAINT uq_department_name UNIQUE (department);

INSERT INTO departments (department, location)
VALUES ('Sales', 'Miami')
ON CONFLICT (department)
DO UPDATE SET location = EXCLUDED.location;
```

---

## 13. JSON / JSONB *(new, Postgres-specific)*

Postgres can store and query semi-structured data natively. `JSONB` (binary JSON) is almost
always the right choice over `JSON` (plain text) — it's indexable and faster to query.

```sql
ALTER TABLE employees ADD COLUMN metadata JSONB;

UPDATE employees
SET metadata = '{"skills": ["SQL", "Python"], "remote": true}'
WHERE emp_id = 1;

-- Pull one field out of the JSON
SELECT name, metadata ->> 'remote' AS is_remote FROM employees WHERE metadata IS NOT NULL;

-- Filter rows by a JSON field's value
SELECT name FROM employees WHERE metadata ->> 'remote' = 'true';

-- Filter rows where a JSON array contains a value
SELECT name FROM employees WHERE metadata -> 'skills' ? 'Python';

-- Index JSONB for fast lookups
CREATE INDEX idx_employees_metadata ON employees USING GIN (metadata);
```

---

## 14. DML: Insert / Update / Delete

```sql
-- Insert a new employee
INSERT INTO employees (name, dept_id, salary, hire_date)
VALUES ('Sabrina Mathew', 3, 57000, '2017-06-15');

-- Update one employee's salary
UPDATE employees SET salary = 55000 WHERE emp_id = 104;

-- Delete employees hired before 2018 (destructive — filter/select first to check the blast radius)
SELECT * FROM employees WHERE hire_date < DATE '2018-01-01';
DELETE FROM employees WHERE hire_date < DATE '2018-01-01';
```

---

## 15. Transactions & Savepoints

Demonstrates atomicity: you can roll back part of a transaction without undoing all of it.

```sql
BEGIN;

SAVEPOINT before_update;
UPDATE employees SET name = 'Vishal' WHERE emp_id = 1;

SAVEPOINT after_first_update;
UPDATE employees SET name = 'John Doe' WHERE emp_id = 1;

SAVEPOINT after_second_update;

-- Undo only the second update, keep the first
ROLLBACK TO SAVEPOINT after_first_update;

COMMIT;
```

---

## 16. Sequences *(new)*

Every `GENERATED AS IDENTITY` / `SERIAL` column is backed by a sequence object you can inspect
and control directly — worth knowing since it's how auto-incrementing actually works under the
hood in Postgres.

```sql
-- Find the sequence backing a column
SELECT pg_get_serial_sequence('employees', 'emp_id');

-- Read the next value without consuming it
SELECT last_value FROM employees_emp_id_seq;

-- Jump the counter forward (e.g. after a bulk import with explicit IDs)
ALTER SEQUENCE employees_emp_id_seq RESTART WITH 1001;
```

---

## 17. Indexes

An index is a lookup structure (typically a B-tree) built on one or more columns so the database
can jump straight to matching rows instead of scanning the whole table — the same idea as a
book's index.

```sql
CREATE INDEX idx_hire_date ON employees (hire_date);

EXPLAIN ANALYZE SELECT * FROM employees WHERE hire_date = '2019-09-12';
```

---

## 18. Views & Materialized Views

A view is a saved query you can `SELECT` from like a table. It doesn't store data itself — it
re-runs the underlying query every time you select from it.

```sql
CREATE VIEW sales_view AS
SELECT e.name, d.department
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
WHERE d.department = 'Sales';

SELECT * FROM sales_view;
```

> Unlike MySQL, **Postgres does support materialized views** — the result is computed once and
> physically stored, so reads are cheap but the data goes stale until you refresh it:
```sql
CREATE MATERIALIZED VIEW sales_view_mat AS
SELECT e.name, d.department
FROM employees e JOIN departments d ON e.dept_id = d.dept_id
WHERE d.department = 'Sales';

SELECT * FROM sales_view_mat;

-- Re-run the underlying query to pick up new data
REFRESH MATERIALIZED VIEW sales_view_mat;
```

---

## 19. Triggers

Postgres triggers are two pieces: a **trigger function** (returns `TRIGGER`) and a
**`CREATE TRIGGER`** statement that wires the function to a table event. This differs from
MySQL, where the trigger body is written inline.

```sql
CREATE TABLE logs (
    log_id       INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    emp_id       INT,
    log_message  VARCHAR(255),
    log_time     TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE OR REPLACE FUNCTION log_employee_insert() RETURNS TRIGGER AS $$
BEGIN
    INSERT INTO logs (emp_id, log_message)
    VALUES (NEW.emp_id, CONCAT('New employee added: ', NEW.name));
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER after_employee_insert
AFTER INSERT ON employees
FOR EACH ROW
EXECUTE FUNCTION log_employee_insert();

CREATE OR REPLACE FUNCTION log_employee_update() RETURNS TRIGGER AS $$
BEGIN
    INSERT INTO logs (emp_id, log_message)
    VALUES (NEW.emp_id, CONCAT('Employee updated: ', NEW.name));
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER after_employee_update
AFTER UPDATE ON employees
FOR EACH ROW
EXECUTE FUNCTION log_employee_update();

CREATE OR REPLACE FUNCTION log_employee_delete() RETURNS TRIGGER AS $$
BEGIN
    INSERT INTO logs (emp_id, log_message)
    VALUES (OLD.emp_id, CONCAT('Employee deleted: ', OLD.name));
    RETURN OLD;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER after_employee_delete
AFTER DELETE ON employees
FOR EACH ROW
EXECUTE FUNCTION log_employee_delete();

-- Try it:
INSERT INTO employees (name, dept_id, salary, hire_date) VALUES ('Vishal Sharma', 3, 90000, '2022-06-15');
UPDATE employees SET dept_id = 2 WHERE name = 'Vishal Sharma';
DELETE FROM employees WHERE name = 'Vishal Sharma';
SELECT * FROM logs ORDER BY log_time DESC;
```

---

## 20. Functions & Stored Procedures

**Deterministic function** — always returns the same output for the same input. Postgres calls
this `IMMUTABLE` rather than `DETERMINISTIC`:
```sql
CREATE OR REPLACE FUNCTION yearly_salary(monthly_salary DECIMAL(10,2))
RETURNS DECIMAL(10,2)
LANGUAGE plpgsql
IMMUTABLE
AS $$
BEGIN
    RETURN monthly_salary * 12;
END;
$$;

SELECT name, yearly_salary(salary) AS yearly FROM employees;
```

**Non-deterministic function** — output can change between calls even with the same input
(`VOLATILE` is actually the Postgres default, shown explicitly here for clarity):
```sql
CREATE OR REPLACE FUNCTION today()
RETURNS DATE
LANGUAGE sql
VOLATILE
AS $$
    SELECT CURRENT_DATE;
$$;
```

**Simple string function:**
```sql
CREATE OR REPLACE FUNCTION hello_world(person_name VARCHAR)
RETURNS VARCHAR
LANGUAGE plpgsql
IMMUTABLE
AS $$
BEGIN
    RETURN CONCAT('Hello ', person_name);
END;
$$;

SELECT hello_world('World');
```

**Stored procedure with an `OUT` parameter.** Unlike MySQL (where you read the result via a
session variable like `@total_salary`), Postgres returns `OUT` parameters directly as a result
row from the `CALL` statement:
```sql
CREATE OR REPLACE PROCEDURE dept_total_salary(IN p_dept_id INT, OUT total_salary DECIMAL(10,2))
LANGUAGE plpgsql
AS $$
BEGIN
    SELECT SUM(salary) INTO total_salary FROM employees WHERE dept_id = p_dept_id;
END;
$$;

CALL dept_total_salary(1, NULL);
```

**Stored procedure with both `IN` and `OUT` parameters:**
```sql
CREATE OR REPLACE PROCEDURE greet(IN visitor_name VARCHAR, OUT greeting VARCHAR)
LANGUAGE plpgsql
AS $$
BEGIN
    greeting := CONCAT('Hello ', visitor_name);
END;
$$;

CALL greet('Vishal', NULL);
```

---

## 21. ALTER TABLE

> Run this section against a scratch/copy table, not the live `employees` table — several of
> these (rename table, drop primary key) would break the queries above.

```sql
-- Add a column
ALTER TABLE employees ADD COLUMN age INT;

-- Drop a column
ALTER TABLE employees DROP COLUMN age;

-- Change a column's data type (MySQL: MODIFY COLUMN)
ALTER TABLE employees ALTER COLUMN age TYPE VARCHAR(3);

-- Rename a column (MySQL: CHANGE COLUMN old new type)
ALTER TABLE employees RENAME COLUMN age TO years;

-- Rename the table (same syntax as MySQL)
ALTER TABLE employees RENAME TO staff;

-- Add a primary key
ALTER TABLE employees ADD PRIMARY KEY (emp_id);

-- Drop a primary key (Postgres has no shorthand — drop the constraint by name)
ALTER TABLE employees DROP CONSTRAINT employees_pkey;

-- Add a foreign key (generic example — orders/customers aren't part of this schema)
ALTER TABLE orders ADD CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customers(customer_id);

-- Drop a foreign key (Postgres: DROP CONSTRAINT, not "DROP FOREIGN KEY")
ALTER TABLE orders DROP CONSTRAINT fk_customer;

-- Add an index (Postgres has no "ALTER TABLE ... ADD INDEX" — indexes are separate objects)
CREATE INDEX idx_name ON employees (name);

-- Drop an index (standalone statement, not via ALTER TABLE)
DROP INDEX idx_name;

-- Default value on a column
ALTER TABLE employees ALTER COLUMN age SET DEFAULT 30;
ALTER TABLE employees ALTER COLUMN age DROP DEFAULT;

-- Reset the identity/auto-increment counter (MySQL: AUTO_INCREMENT = 1001)
ALTER TABLE employees ALTER COLUMN emp_id RESTART WITH 1001;
```

> Note: `ENGINE = InnoDB` from the MySQL version has no Postgres equivalent — Postgres has a
> single storage engine, so there's nothing to switch.

---

## 22. ACID Properties

| Property        | Meaning                                                                 | Example |
|-----------------|--------------------------------------------------------------------------|---------|
| **Atomicity**   | A transaction is all-or-nothing.                                        | A bank transfer debits one account and credits another; if the credit fails, the debit is rolled back too. |
| **Consistency** | A transaction always leaves the database in a valid state.              | Constraints (PK, FK, unique, check) must hold; a violating transaction is aborted. |
| **Isolation**   | Concurrent transactions don't see each other's uncommitted changes.     | Two transactions editing the same row don't interfere mid-flight. |
| **Durability**  | Once committed, changes survive crashes/power loss.                     | Data written by a commit is safe even if the server crashes a second later. |

---

## 23. Normalization

| Form | Requirement |
|------|-------------|
| **1NF** | Every column holds a single, atomic value (no repeating groups or comma-packed lists). |
| **2NF** | Must be in 1NF, and every non-key column depends on the *whole* primary key (matters for composite keys). |
| **3NF** | Must be in 2NF, and no non-key column depends on another non-key column (no transitive dependency). |
| **BCNF** | A stricter 3NF: every determinant must be a candidate key. |
| **4NF** | Must be in BCNF, with no multi-valued dependencies (one entity, two independent multi-valued facts, in one table). |
| **5NF** | Must be in 4NF, with no join dependency — the table can't be split into smaller tables and losslessly rejoined. |

---

## 24. Interview Theory Cheat Sheet *(new)*

The sections above are mostly "write the query." Interviews also probe concepts that never show
up as a query you'd run — the stuff below fills that gap.

### 24.1 Logical query execution order

SQL reads top-to-bottom but *executes* in a fixed order that doesn't match how you type it. This
is the single most common "why doesn't my query work" interview question (e.g. "why can't I use
a `SELECT` alias in `WHERE`?" — because `WHERE` runs before `SELECT`).

```
FROM / JOIN  →  WHERE  →  GROUP BY  →  HAVING  →  SELECT  →  DISTINCT  →  ORDER BY  →  LIMIT/OFFSET
```

- `WHERE` filters rows *before* grouping — you can't reference an aggregate in it.
- `HAVING` filters *after* grouping — use it for conditions on aggregates (`SUM(salary) > ...`).
- Column aliases defined in `SELECT` aren't visible to `WHERE` or `GROUP BY` in standard SQL,
  but Postgres does allow using a `SELECT` alias in `GROUP BY` and `ORDER BY` (not `WHERE`).

### 24.2 WHERE vs HAVING

| | `WHERE` | `HAVING` |
|---|---|---|
| Runs | Before grouping | After grouping |
| Filters | Individual rows | Groups (post-aggregation) |
| Can use aggregates? | No | Yes |
| Example | `WHERE salary > 50000` | `HAVING SUM(salary) > 200000` |

### 24.3 JOIN types, at a glance

| Join | Returns |
|---|---|
| `INNER JOIN` | Only rows with a match on both sides. |
| `LEFT JOIN` | All rows from the left table; unmatched right-side columns are `NULL`. |
| `RIGHT JOIN` | Mirror of `LEFT JOIN` — all rows from the right table. |
| `FULL OUTER JOIN` | All rows from both sides; unmatched columns on either side are `NULL`. |
| `CROSS JOIN` | Cartesian product — every row from the left paired with every row from the right. |
| `SELF JOIN` | A table joined to itself, usually to compare rows within the same table (Q22). |

A `FULL OUTER JOIN` can be simulated where unsupported with `LEFT JOIN ... UNION ... RIGHT JOIN`.

### 24.4 `EXISTS` vs `IN` vs `JOIN`

All three can express "rows that have a related row elsewhere," but they behave differently:

- **`IN`** — good for a small, static, or precomputed list. Struggles with `NULL`s inside the
  subquery (a `NULL` in the list can make the whole condition `UNKNOWN`).
- **`EXISTS`** — a correlated subquery that stops as soon as it finds one match; generally the
  better choice for large or correlated subqueries since it doesn't materialize the full list.
- **`JOIN`** — best when you also need columns *from* the related table, not just a yes/no test.
  Careful: joining to a table with duplicate matches multiplies rows — use `EXISTS` instead if you
  only need a filter.

```sql
-- Departments that have at least one project, via EXISTS
SELECT d.* FROM departments d
WHERE EXISTS (SELECT 1 FROM projects p WHERE p.dept_id = d.dept_id);
```

### 24.5 Correlated vs non-correlated subqueries

- **Non-correlated**: the inner query can run completely on its own (e.g. `WHERE salary >
  (SELECT AVG(salary) FROM employees)` — computed once).
- **Correlated**: the inner query references a column from the outer query (e.g. Q37, Q44), so
  conceptually it re-runs once per outer row. This is why correlated subqueries can be slow on
  large tables — a window function or a `JOIN` against a pre-aggregated subquery is often a
  faster rewrite of the same logic (see Q69 rewriting Q53's pattern).

### 24.6 Keys & constraints

| Term | Meaning |
|---|---|
| **Primary key** | Uniquely identifies a row; implies `NOT NULL` + `UNIQUE`; one per table. |
| **Candidate key** | Any column (or set of columns) that *could* have been the primary key. |
| **Composite key** | A primary/unique key made of more than one column together. |
| **Foreign key** | A column referencing another table's primary/unique key; enforces referential integrity. |
| **Surrogate key** | An artificial key with no business meaning (e.g. `emp_id GENERATED AS IDENTITY`) — used here for every table. |
| **Natural key** | A key made from real-world data that's already unique (e.g. email, SSN) — riskier long-term since "unique" facts can change. |
| **Unique constraint** | Like a primary key (no duplicates) but a table can have several, and it allows one `NULL` (Postgres treats multiple `NULL`s as distinct, so a unique column can hold many `NULL`s). |

### 24.7 `DELETE` vs `TRUNCATE` vs `DROP`

| | `DELETE` | `TRUNCATE` | `DROP` |
|---|---|---|---|
| Removes | Rows matching a `WHERE` (or all rows) | All rows, instantly | The table itself, structure included |
| Can roll back? | Yes (inside a transaction) | Yes in Postgres (unlike MySQL) | Yes in Postgres |
| Fires triggers? | Yes | No (row-level triggers don't fire) | N/A |
| Resets identity/sequence? | No | Yes, by default (`TRUNCATE ... RESTART IDENTITY`) | N/A (table is gone) |
| Speed on large tables | Slower (logs each row) | Fast | Instant |

### 24.8 Transaction isolation levels & anomalies

Isolation levels trade correctness guarantees for concurrency/performance. Postgres defaults to
`READ COMMITTED`.

| Anomaly | What happens |
|---|---|
| **Dirty read** | Reading another transaction's *uncommitted* changes (theoretically possible at `READ UNCOMMITTED`; Postgres never actually allows this). |
| **Non-repeatable read** | Re-reading the same row twice in one transaction gives different values because another transaction committed in between. |
| **Phantom read** | Re-running the same query twice returns a *different set of rows* (new rows appeared/disappeared) due to concurrent inserts/deletes. |

| Isolation level | Prevents |
|---|---|
| `READ UNCOMMITTED` | Nothing (Postgres treats this the same as `READ COMMITTED`) |
| `READ COMMITTED` (Postgres default) | Dirty reads |
| `REPEATABLE READ` | Dirty reads + non-repeatable reads |
| `SERIALIZABLE` | All of the above, including phantoms — transactions behave as if run one at a time |

```sql
BEGIN TRANSACTION ISOLATION LEVEL SERIALIZABLE;
-- ...
COMMIT;
```

### 24.9 Views vs materialized views vs CTEs

| | Stores data? | Refreshed when? | Reusable across queries? |
|---|---|---|---|
| **View** | No — re-runs the query each time | Always live | Yes |
| **Materialized view** | Yes — physically stored | Only on `REFRESH MATERIALIZED VIEW` | Yes |
| **CTE (`WITH ...`)** | No — scoped to a single statement | N/A | No — dies at the end of the statement |

### 24.10 Indexing internals & trade-offs

- Postgres's default index type is a **B-tree** — good for equality and range queries (`=`, `<`,
  `>`, `BETWEEN`, sorting).
- Other index types: **GIN** (arrays, `JSONB`, full-text search — Section 13), **GiST**
  (geometric/range types), **BRIN** (huge, naturally-ordered tables like time-series log data).
- Indexes speed up reads but slow down writes (`INSERT`/`UPDATE`/`DELETE` have to update the
  index too) and take extra disk space — don't index every column reflexively.
- Postgres has no "clustered index" concept like SQL Server (where the table *is* the index);
  all Postgres indexes are secondary structures pointing back at the table's heap. `CLUSTER` exists
  as a one-off command to physically reorder a table by an index, but it doesn't stay maintained.
- A composite index on `(a, b)` can serve queries filtering on `a` alone, but generally **not**
  ones filtering on `b` alone — leftmost-prefix rule.
- `EXPLAIN ANALYZE` is how you check whether an index is actually being used (`Index Scan` /
  `Bitmap Index Scan`) versus a full `Seq Scan`.

### 24.11 `UNION` vs `UNION ALL`

`UNION` deduplicates the combined result (implicit `DISTINCT` sort/hash — costs performance);
`UNION ALL` just concatenates, no dedup work. Default to `UNION ALL` unless you specifically need
duplicates removed.

### 24.12 NULL and three-valued logic

SQL has three truth values: `TRUE`, `FALSE`, and `UNKNOWN`. Any comparison involving `NULL`
(`= NULL`, `<> NULL`, `NULL > 5`, ...) evaluates to `UNKNOWN`, not `TRUE`/`FALSE`, and rows where
a `WHERE`/`HAVING` condition is `UNKNOWN` are excluded — a frequent source of "why didn't this
row show up" bugs.

```sql
-- Wrong: this never matches, even for rows where budget really is NULL
SELECT * FROM projects WHERE budget = NULL;

-- Correct
SELECT * FROM projects WHERE budget IS NULL;
```

This also explains why `NOT IN (subquery)` silently returns zero rows if the subquery produces
even one `NULL` — the comparison against that `NULL` is `UNKNOWN`, which poisons the whole `NOT
IN`. `NOT EXISTS` doesn't have this problem, which is why it's usually the safer choice.

### 24.13 Normalization vs denormalization

Normalizing (Section 23) removes redundancy and update anomalies but costs more joins at read
time. Denormalizing (duplicating data, e.g. storing a department name directly on `employees`)
speeds up reads at the cost of redundancy and the risk of the copies drifting out of sync.
Real systems mix both: normalized OLTP schema for writes, denormalized/materialized views or a
separate reporting schema for read-heavy analytics.

### 24.14 Quick-fire interview questions worth being able to answer out loud

- What's the difference between a `PRIMARY KEY` and a `UNIQUE` constraint?
- Why would `RANK()` and `DENSE_RANK()` give different results on the same data? (Q66)
- When would you reach for a window function instead of a `GROUP BY`? (Section 7 intro)
- Why can a `LEFT JOIN` produce more rows than the left table has? (One-to-many matches on the
  right side.)
- What happens to `NOT IN` if the subquery returns a `NULL`? (Section 24.12)
- Difference between clustered and non-clustered indexes — and why the distinction barely
  applies in Postgres. (Section 24.10)
- Why is `EXISTS` often preferred over `IN` for large correlated subqueries? (Section 24.4)
- What's the difference between `DELETE`, `TRUNCATE`, and `DROP`? (Section 24.7)
- What isolation level does Postgres use by default, and what anomaly does it still allow?
  (Section 24.8 — `READ COMMITTED`; allows non-repeatable reads and phantoms)
- Why might a materialized view return stale data? (No auto-refresh — Section 24.9)

---

## Appendix: things intentionally left out

- The "employees who report to the same manager" question needs `manager_id` — covered in
  [Section 8](#8-recursive-cte) once you add that column.
- A couple of malformed trigger/procedure fragments from the original MySQL notes (stray text
  where a body should be, a typo'd table name) were dropped rather than "fixed," since they were
  mid-experiment scratch, not real queries.
- Postgres-only additions worth exploring further once comfortable: arrays (`TEXT[]`, `ANY()`,
  `unnest()`), full-text search (`tsvector`/`tsquery`), and `LATERAL` joins.
