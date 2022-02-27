package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;
public class Switch_daynumbers  {

    public static void main(String[] args) {

        int month;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        month = scan.nextInt();
        scan.close();

        switch(month){
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 day or 29 days depends from year");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Wrong number");

        }


    }
}