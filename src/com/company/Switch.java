package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;
public class Switch  {

    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        number = scan.nextInt();
        scan.close();

        switch(number){
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("MIddle");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very Good");
                break;
            case 6:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Wrong grade");

        }


    }
}
