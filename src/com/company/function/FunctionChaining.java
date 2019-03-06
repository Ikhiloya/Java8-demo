package com.company.function;

import java.util.function.Function;

/**
 * @author Ikhiloya Imokhai on 3/4/2019
 * @project Java8
 */
public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s1-> s1.substring(0,9);

        System.out.println("The result of f1: " + f1.apply("IkhiloyaImokhai"));
        System.out.println("The result of f2: " +f2.apply("IkhiloyaImokhai"));

        System.out.println("The result of f1.andThen(f2) is: "+ f1.andThen(f2).apply("IkhiloyaImokhai"));
        System.out.println("The result pf f1.compose(f2) is: " + f1.compose(f2).apply("IkhiloyaImokhai"));


        Function<Integer, Integer> f3 = i->i+i;
        Function<Integer, Integer> f4 = i->i*i*i;

        System.out.println("The result of f3.andThen(f4) is : "+ f3.andThen(f4).apply(2));
        System.out.println("The result pf f3.compose(f4) is: " + f3.compose(f4).apply(2));


        //Identity
        System.out.println("Identity");
        Function<String, String> t = Function.identity();
        System.out.println(t.apply("Ikhiloya"));
    }
}
