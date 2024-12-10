package com.question1;

import java.util.List;

public class Department {

    private int id;
    private String name;
    List<Employee> listOfEmployees;

    public Department(int id, String name, List<Employee> listOfEmployees) {
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

    public List<Employee> getListOfEmployees() {
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
