package com.company.bifunction.employee;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class Employee {
    private int empNo;
    private String name;
    private double dailyWage;

    public Employee(int empNo, String name, double dailyWage) {
        this.empNo = empNo;
        this.name = name;
        this.dailyWage = dailyWage;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }
}
