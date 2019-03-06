package com.company.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * @author Ikhiloya Imokhai on 3/3/2019
 * @project Java8
 */
public class PredicateForUserAuthentication {
    public static void main(String[] args) {
        Predicate<User> p = user -> user.username.equals("Loya") && user.password.equals("password");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = scanner.next();

        System.out.println("Enter Password");
        String password = scanner.next();

        User user = new User(username, password);

       boolean isValid = p.test(user);

       if(isValid)
           System.out.println("Logged in.....");
       else
           System.out.println("Invalid user, please log in with valid credentials");
    }
}
