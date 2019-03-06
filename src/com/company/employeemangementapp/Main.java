package com.company.employeemangementapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Ikhiloya Imokhai on 3/4/2019
 * @project Java8
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp = new Employee("Durga", "CEO", 30000, "Hyderbad");
        employees.add(new Employee("Durga", "CEO", 30000, "Hyderbad"));
        employees.add(new Employee("Sunny", "Manager", 20000, "Hyderbad"));
        employees.add(new Employee("Mark", "Developer", 20000, "Lagos"));
        employees.add(new Employee("Loya", "Manager", 20000, "Canada"));
        System.out.println(employees);


        Predicate<Employee> p = employee -> employee.getDesignation().equals("Manager");
        Predicate<Employee> p1 = employee -> employee.getCity().equals("Hyderbad");
        Predicate<Employee> p2 = employee -> employee.getSalary() > 20000;
        Predicate<Employee> p3 = employee -> employee.getSalary() > 20000 && employee.getCity().equals("Hyderbad");

        Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Durga", "CEO", 30000, "Hyderbad"));
        System.out.println(isCEO.test(emp));

//        filterByDesignation(p1.or(p2), employees);
        filterByDesignation(p1.negate(), employees);
    }

    private static void filterByDesignation(Predicate<Employee> p, List<Employee> employees) {
        for (Employee emp : employees) {
            if (p.test(emp)) {
                System.out.println(emp);
            }
        }

    }
}
