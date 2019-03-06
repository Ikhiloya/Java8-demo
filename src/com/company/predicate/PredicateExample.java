package com.company.predicate;

import java.util.function.Predicate;

/**
 * @author Ikhiloya Imokhai on 3/3/2019
 * @project Java8
 * Program to display names that starts with 'K' by using Predicate
 */
public class PredicateExample {

    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", " ", null, "Malika", "Katrina", "Kareem", "Loya"};
//        Predicate<String> p1 = name -> name.startsWith("K");
//        Predicate<String> p1 = name -> name.charAt(0) == 'K';

        //remove null and empty strings
        Predicate<String> p3 = name -> name != null && name.length() != 0;
//        getNameStartingWithK(p1, names);

        System.out.println("Removed null or empty Strings");
        removeNullOrEmptyStrings((p3), names);

    }


    public static void getNameStartingWithK(Predicate<String> p, String[] names) {
        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }

        }
    }

    public static void removeNullOrEmptyStrings(Predicate<String> p, String[] names) {
        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }

        }
    }


}
