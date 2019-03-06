package com.company.biconsumer;

import java.util.function.BiConsumer;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);
        biConsumer.accept("Ikhiloya", "Imokhai");
    }
}
