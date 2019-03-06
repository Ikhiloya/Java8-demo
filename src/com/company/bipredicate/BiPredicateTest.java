package com.company.bipredicate;

import java.util.function.BiPredicate;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class BiPredicateTest {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate = BiPredicateTest::isNumberGreaterThanZero;
        System.out.println(biPredicate.test(4, 1));

        BiPredicate<String, String> checkStringPredicate = BiPredicateTest::checkPasswords;
        System.out.println("Password same?: " + checkStringPredicate.test("password", "password"));
    }


    private static boolean checkPasswords(String oldPassword, String newPassword) {
        return oldPassword.equals(newPassword);
    }

    private static boolean isNumberGreaterThanZero(Integer i1, Integer i2) {
        return (i1 + i2) >= 0;
    }
}
