package com.company.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Ikhiloya Imokhai on 3/4/2019
 * @project Java8
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sunny", 100));
        students.add(new Student("Bunny", 65));
        students.add(new Student("Chinny", 55));
        students.add(new Student("Vinny", 45));
        students.add(new Student("Pinny", 25));


        Function<Student, String> f = StudentTest::apply;


        Predicate<Student> studentPredicate = student -> student.getMarks() >= 60;
        filterGrades(studentPredicate,students,f);

        for (Student s : students) {
            System.out.println(s.getName() + " scored " + s.getMarks() + " marks and the grade is: " + f.apply(s));
        }
    }


    private static void filterGrades(Predicate<Student> p, List<Student> students, Function<Student, String> f) {
        for(Student s : students){
            if(p.test(s)){
                System.out.println("name: " + s.getName());
                System.out.println("marks: " + s.getMarks());
                System.out.println("grade: " + f.apply(s));
            }
        }
    }


    private static String apply(Student student) {
        int marks = student.getMarks();
        if (marks >= 80) {
            return "A[Distinction]";
        } else if (marks >= 60) {
            return "B[First Class]";
        } else if (marks >= 50) {
            return "C[Second Class]";
        } else if (marks >= 35) {
            return "D[Third Class]";
        } else {
            return "E[Failed]";
        }
    }
}
