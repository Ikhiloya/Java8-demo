package com.company.bifunction.employee;

import java.util.function.BiFunction;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class CalculateWage {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Loya", 1500.0);
        TimeSheet timeSheet = new TimeSheet(101, 25);

        BiFunction<Employee, TimeSheet, Double> biFunction = CalculateWage::getDailyWage;

        Double dailyWage = biFunction.apply(employee, timeSheet);

        System.out.printf("The daily wage of %s is %.2f", employee.getName(), dailyWage);
    }

    private static Double getDailyWage(Employee emp, TimeSheet timeSht) {
        return (emp.getDailyWage() * timeSht.getDays());
    }
}
