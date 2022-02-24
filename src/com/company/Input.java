package com.company;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        number = scan.nextInt();
        scan.close();

        if(number == 2){
        System.out.println("Poor"+ number);
        } else if(number == 3) {
            System.out.println("Middle" + number);
        }else if(number == 4) {
            System.out.println("Good" + number);
        }else if(number == 5) {
        System.out.println("Very Good" + number);
    }else if(number == 6) {
        System.out.println("Excellent" + number);
    } else {
            System.out.println("Input number between 2 and 6");
        }

    }
}
