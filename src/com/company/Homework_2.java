package com.company;
import java.util.Scanner;

public class Homework_2 {

    public static void main(String[] args) {
        float Classes;
        float Attendance;
        float a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Classes");
        Classes = scan.nextInt();

        System.out.println("Enter any Attendance");
        Attendance = scan.nextInt();
        scan.close();
        a= Attendance/Classes;
        float b = a * 100;
        System.out.println(b+"%");
        if (b>75) {

            System.out.println("You are  able to attend");
        } else{
            System.out.println("You are not able to attend");
        }
    }
}
