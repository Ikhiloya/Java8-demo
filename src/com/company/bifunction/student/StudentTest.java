package com.company.bifunction.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        BiFunction<String, Integer, Student> studentBiFunction = Student::new;

        students.add(studentBiFunction.apply("Loya", 24));
        students.add(studentBiFunction.apply("Deji", 26));
        students.add(studentBiFunction.apply("Mark", 23));
        students.add(studentBiFunction.apply("Tayo", 26));

        for (Student s : students) {
            System.out.println("name : " + s.getName());
            System.out.println("rollno : " + s.getRollNo());
            System.out.println();
        }


    }
}
