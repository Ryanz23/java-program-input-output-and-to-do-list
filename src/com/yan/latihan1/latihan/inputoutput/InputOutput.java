package com.yan.latihan1.latihan.inputoutput;

import java.util.Scanner;

public class InputOutput {
    //Static method with a single parameter
    static void tryMethod(String flname){
    }
    //Method name
    public static void tr(){
        System.out.println("Welcome to Program!");
        String fname, lname;
        //Create a scanner object for user input
        Scanner myFname = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        //Read the user input
        fname = myFname.nextLine();

        Scanner myLname = new Scanner(System.in);
        System.out.print("Enter Last Name : ");
        //Read the user input
        lname = myLname.nextLine();

        //Printing the fullname
        System.out.print("Hello ");
        System.out.println(fname + " " + lname);
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
