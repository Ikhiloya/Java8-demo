package com.company.employeemangementapp;

/**
 * @author Ikhiloya Imokhai on 3/4/2019
 * @project Java8
 */
public class Employee {
    private String name;
    private String designation;
    private double salary;
    private String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String s = "(" +String.format("%s, %s, %.2f, %s", name, designation, salary, city) +")";
        return s;

    }
}
