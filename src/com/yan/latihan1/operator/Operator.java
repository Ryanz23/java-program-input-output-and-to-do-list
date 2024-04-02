package com.yan.latihan1.operator;

import java.util.Scanner;

public class Operator {
    public static void operator(){
        //create the new scanner
        Scanner scanner = new Scanner(System.in);

        //create a variable and call the scanner to input the value
        System.out.print("Input a : ");
        double a = scanner.nextDouble();
        System.out.print("Input b : ");
        double b = scanner.nextDouble();
        System.out.print("Input c : ");
        double c = scanner.nextDouble();

        //Conditions where 'a' is not a linear equation if the value is 0
        if (a == 0){
            System.out.print("This is not a linear equation");
            return;
        }

        //show the result of a linear equation
        double x = (c - b) / a;
        System.out.println("The value of x is : " + x);
    }
}
