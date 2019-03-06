package com.company.consumer;

import java.util.function.Consumer;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Movie> c1 = movie -> System.out.println("Movie: " + movie.getName() + " is ready to release");
        Consumer<Movie> c2 = movie -> System.out.println("Movie: " + movie.getName() + " is " + movie.getResult());
        Consumer<Movie> c3 = movie -> System.out.println("Movie: " + movie.getName() + " information storing in database ");

        Consumer<Movie> chainedConsumer = c1.andThen(c2).andThen(c3);

        Movie movie = new Movie("Creed", "Hit");

        chainedConsumer.accept(movie);
    }
}
