package com.company.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ikhiloya Imokhai on 3/3/2019
 * @project Java8
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        List<String> s = new ArrayList<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        s.add("ddd");
        l.add(0);
        l.add(5);
        l.add(20);
        l.add(25);
        l.add(10);
        l.add(15);

        System.out.println(l);

        Predicate<Integer> p = i -> i % 2 == 0;
        //extract even numbers
        System.out.println("filter() method");

        List<Integer> l1 = l.stream().filter(p).collect(Collectors.toList());
        System.out.println(l1);


        //double elements in a list
        System.out.println("map() method");
        List<Integer> l2 = l.stream().map(I -> I * 2).collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("Sorted list according to default or natural order");
        List<Integer> l3 = l.stream().map(I -> I * 2).sorted().collect(Collectors.toList()); // default sorting
        System.out.println(l3);

        System.out.println("customized Sorted list using Comparator in descending order");
        List<Integer> l4 = l.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l4);

        System.out.println("count() method");
        long count = l.stream().map(I -> I * 2).count();
        System.out.println(count);

        System.out.println("min() method");
        Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);


        System.out.println("max() method");
        Integer max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);

        System.out.println("forEach() method");
        s.stream().forEach(System.out::println);
        s.stream().forEach(a -> System.out.println(a));


        System.out.println("toArray() method");
        Integer[] ar = l.stream().toArray(Integer[]::new);
        for (Integer x : ar
        ) {
            System.out.println(x);

        }

        //Applying streams to a group of values that are not Collections
        System.out.println("Applying streams to a group of values that are not Collections");
        Stream<Integer> stream = Stream.of(9, 99, 999, 9999, 99999);
        stream.forEach(System.out::println);


        //Applying streams to an array
        System.out.println("Applying streams to a Double array");
        Double[] d = {10.0, 10.1, 10.2, 10.3, 10.4};
        Stream<Double> t = Stream.of(d);
        t.forEach(System.out::println);


    }
}
