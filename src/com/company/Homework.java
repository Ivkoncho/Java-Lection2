package com.company;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        number = scan.nextInt();
        scan.close();

        if(number>0) {
        System.out.println(number);
        } else System.out.println(number*(-1));




    }
}
