package com.yan.latihan1.latihan.operator;

import java.util.Scanner;

public class Boolean {
    public static void bool(){
        System.out.println("Selamat Datang");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x : ");
        int x = scanner.nextInt();
        System.out.print("Input y : ");
        int y = scanner.nextInt();

        boolean small = true;
        boolean big = false;

        if (x < y){
            System.out.println("The value is " + small);
        } else if (x > y) {
            System.out.println("The value is " + big);
        } else {
            System.out.println("Values are worth the same");
        }
    }
}
