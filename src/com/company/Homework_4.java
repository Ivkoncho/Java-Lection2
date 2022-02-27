package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Homework_4 {

    public static void main(String[] args) {
        // write your code here
        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        System.out.println(randomNum);

        if((randomNum%2==0)){
            System.out.println("The randomNum is odd");
        } else {System.out.println("The randomNum is even");
        }




    }
}
