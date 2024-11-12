package Collections_Stage_1.Q7;

public class Employee implements Comparable<Employee>{

    private int emp_id;
    private String emp_first_name;
    private String emp_last_name;
    private float salary;
    private int experience;

    public Employee(int emp_id, String emp_first_name, String emp_last_name, float salary, int experience) {
        this.emp_id = emp_id;
        this.emp_first_name = emp_first_name;
        this.emp_last_name = emp_last_name;
        this.salary = salary;
        this.experience = experience;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_first_name() {
        return emp_first_name;
    }

    public void setEmp_first_name(String emp_first_name) {
        this.emp_first_name = emp_first_name;
    }

    public String getEmp_last_name() {
        return emp_last_name;
    }

    public void setEmp_last_name(String emp_last_name) {
        this.emp_last_name = emp_last_name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_first_name='" + emp_first_name + '\'' +
                ", emp_last_name='" + emp_last_name + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return o.getEmp_id() - getEmp_id();
    }


    // Sort base on their first name
//    @Override
//    public int compareTo(Employee o) {
//        return getEmp_first_name().compareTo(o.getEmp_first_name());
//    }

    // If any two employees first name is equal sort based on the last
// name if the employees last name also equal sort that employee
// objects based on their salary or experience.
//    @Override
//    public int compareTo(Employee o) {
//        if(getEmp_first_name() == o.getEmp_first_name()){
//            return getEmp_last_name().compareTo(o.getEmp_last_name());
//        }
//        if(getEmp_last_name() == o.getEmp_last_name()){
//            return (int) (getSalary() - o.getSalary());
//        }
//        if(getEmp_last_name() == o.getEmp_last_name()){
//            return (getExperience() - o.getExperience());
//        }
//        return 1;
//    }

    //    Sort base on their employee id
//    @Override
//    public int compareTo(Employee o) {
//        return getEmp_id() - o.getEmp_id();
//    }





}
