package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int randomNum = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
        System.out.println(randomNum);
        if (randomNum > 0) {
            System.out.println("randomNum is greater then 0");
        } else System.out.println("randomNum is negative");

        System.out.println("The other metod");

        String number = randomNum > 0 ? "randomNum is greater then 0" : "randomNum is negative";
        System.out.println(number);



    }
}

