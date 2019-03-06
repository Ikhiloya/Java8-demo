package com.company.methodReferencing;

/**
 * @author Ikhiloya Imokhai on 3/3/2019
 * @project Java8
 */
public class Test {
    public static void m2() {
        System.out.println("Method Referencing");
    }

    public static void main(String[] args) {
        Interf i = Test::m2;
        i.m1();
    }
}
