package com.yan.latihan1.latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void todoList(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true){
            System.out.println("Let's Add Your Whishlist!");

            if (!tasks.isEmpty()){
                for (int i = 0; i < tasks.size(); i++){
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else {
                System.out.println("No List Yet.");
            }

            System.out.println("========== MENU =========");
            System.out.println("Please Add Your List");

            System.out.println("1. Add List");
            System.out.println("2. Mark List Done");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Add List : ");

                    scanner.nextLine();
                    String todo = scanner.nextLine();

                    System.out.println(todo);

                    tasks.add(todo);

                    System.out.println("Wishlist added successfully");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No task~~ yet");
                        break;
                    }

                    System.out.print("Enter task number to mark done (1 - " + tasks.size() + " ): ");
                    int taskNumber = scanner.nextInt() - 1;

                    if (taskNumber >= 0 && taskNumber <= tasks.size() - 1) {
                        tasks.remove(taskNumber);
                        System.out.println("Task marked as done");
                    } else {
                        System.out.println("Invalid task number");
                    }
                    break;
                case 3:
                    System.out.println("Good bye");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }
}
