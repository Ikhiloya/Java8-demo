package com.company.supplier;

import java.util.function.Supplier;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 * <p>
 * Length should be 8 characters
 * 2,4,6,8 places: only digits
 * 1,3,5,7 places: only uppercase alphabet symbols and @,#,$
 */
public class SupplierRandomPasswordGenerator {
    public static void main(String[] args) {

        Supplier<String> supplier = SupplierRandomPasswordGenerator::getRandomPassword;


        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
        System.out.println("Random Password: " + supplier.get());
    }

    private static String getRandomPassword() {
        StringBuilder password = new StringBuilder();
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        Supplier<Integer> numberSupplier = SupplierRandomPasswordGenerator::getRandomNumber;

        Supplier<Character> stringSupplier = () -> symbol.charAt((int) (Math.random() * symbol.length()));


        for (int i = 1; i <= 8; i++) {

            if (i % 2 == 0) {
                password.append(numberSupplier.get().toString());
            } else {
                password.append(stringSupplier.get().toString());
            }
        }
        return String.valueOf(password);
    }


    private static Integer getRandomNumber() {
        Integer rand = (int) (Math.random() * 10);
        return rand;
    }
}
