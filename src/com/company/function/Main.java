package com.company.function;

import java.util.function.Function;

/**
 * @author Ikhiloya Imokhai on 3/4/2019
 * @project Java8
 */
public class Main {
    public static void main(String[] args) {

//        Function<String, Integer> f = s->s.length();
        // Function to return the length of a String
        Function<String, Integer> f = String::length;
        Integer length = f.apply("Ikhiloya");
        System.out.println("Length of String: " + length);

        //Function to return the square of an integer number
        Function<Integer, Integer> s = i -> i * i;
        Integer sqaureNum = s.apply(2);
        System.out.println("The square of 2 is: " + sqaureNum);

        //program to replace all spaces present in the given string
        String word = "It is a beautiful night here in ontario";
        Function<String, String> fxn = string -> string.replaceAll(" ", "");
        String newWord = fxn.apply(word);
        System.out.println("Word without spaces" + "\n" + newWord);

        //program to count all spaces present in the given string
        Function<String, Integer> countFxn = s1 -> s1.length() - s1.replaceAll(" ", "").length();
        Integer count = countFxn.apply(word);
        System.out.println("Number of Spaces in String is:" + "\n" + count);
    }

}
