package com.yan.latihan1.latihan.inputoutput;

import java.util.Scanner;

public class InputOutput {
    //Method name
    public static void io(){
        System.out.println("Input Output Sederhana");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Depan: ");
        String firstName = scanner.nextLine();

        System.out.print("Masukan Nama Belakang: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println("Halo " + fullName);
    }


    //Input-Output with three method
    //The main method is in a separate class

    //Method to get the full name
    public static String getFullName(){
        System.out.println("Welcome to Program!");
        System.out.println("Please Enter Your Name");

        //Add as a string variable
        String fname, lname;
        //Build a scanner for user input
        Scanner myFname = new Scanner(System.in);
        System.out.print("First Name : ");
        fname = myFname.nextLine();

        Scanner myLname = new Scanner(System.in);
        System.out.print("Last Name : ");
        //Read the user input
        lname = myLname.nextLine();

        return fname + " " + lname;
    }

    //Method to print the full name
    public static void printFullname (String fullName){
        //print the output
        System.out.println("Hello " + fullName);
    }
}
