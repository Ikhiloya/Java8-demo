package com.company.bifunction;

import java.util.function.BiFunction;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = BiFunctionTest::multiply;
        Integer product = biFunction.apply(4, 5);
        System.out.println(product);
    }

    private static Integer multiply(Integer a, Integer b) {
        return a * b;
    }
}
