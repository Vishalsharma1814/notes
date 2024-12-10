package com.question2;

import com.question1.Employee;

import java.util.List;

public class Department {
    private int id;
    private String name;
    List<com.question1.Employee> listOfEmployees;

    public Department(int id, String name, List<com.question1.Employee> listOfEmployees) {
        this.id = id;
        this.name = name;
        this.listOfEmployees = listOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<com.question1.Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listOfEmployees=" + listOfEmployees +
                '}';
    }
}
