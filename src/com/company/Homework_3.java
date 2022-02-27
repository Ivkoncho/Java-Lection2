package com.company;
import java.util.Scanner;

public class Homework_3 {

    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Day");
        day = scan.nextInt();

        System.out.println("Enter any Month");
        month = scan.nextInt();

        System.out.println("Enter any Year");
        year = scan.nextInt();
        scan.close();

        if (day <= 31 && (month ==1 || month ==3 || month==5 || month ==7 || month==8 ||month==10 || month ==12)) {
            System.out.println("Valid date");}

        if (day < 31 && (month ==4 || month ==6 || month==9 || month ==11)){
                System.out.println("Valid date");}

        if (day <= 29 && month==2 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))){
            System.out.println("Valid date");
        }
        if (day<=28 && month== 2){
            System.out.println("Valid date");
        }
        else {System.out.println("Not a valid date");
    }

    }
}
