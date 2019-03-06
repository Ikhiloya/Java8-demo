package com.company;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[]x = {0,5,10,15,20,25,30};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i %2 == 0;



//        System.out.println(p1.test(30));
//        System.out.println(p1.negate().test(3));
//        System.out.println(p1.test(300));
//
//
//        System.out.println("is Even or Odd");
//
//        System.out.println(p2.test(10));
//        System.out.println(p2.test(5));
//
//        System.out.println("Predicate Joining");
//        System.out.println(p1.and(p2).test(21));
//        System.out.println(p1.or(p2).test(21));

        System.out.println("The numbers greater than 10 are:");
        m1(p1,x);

        System.out.println("The even numbers are:");
        m1(p2,x);


        System.out.println("The numbers not greater than 10 are:");
        m1(p1.negate(),x);

        System.out.println("The numbers greater than 10 and are even are:");
        m1(p1.and(p2),x);

        System.out.println("The numbers greater than 10 or are even are:");
        m1(p1.or(p2),x);


    }

    public static  void m1(Predicate<Integer> p, int[] x){
        for(int x1:x){
            if(p.test(x1)){
                System.out.println(x1);
            }
        }
    }

}
