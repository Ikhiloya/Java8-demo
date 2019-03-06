package com.company.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author Ikhiloya Imokhai on 3/5/2019
 * @project Java8
 */
public class SupplierTest {
    public static void main(String[] args) {

        Supplier<Date> supplier = () -> new Date();

        System.out.println(supplier.get());


        //generates random name using Supplier
        Supplier<String> stringSupplier = SupplierTest::getRandomName;

        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());

        //generates 6-digit OTP using consumer
        Supplier<String> otpSupplier = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };

        System.out.println("OTP is: " + otpSupplier.get());
        System.out.println("OTP is: " + otpSupplier.get());
        System.out.println("OTP is: " + otpSupplier.get());


    }

    // generate random name
    private static String getRandomName() {
        String[] strings = {"Sunny", "Bunny", "Chinny", "Vinny"};
        int x = (int) (Math.random() * 4); // 0 to 3

        return strings[x];
    }
}
