package com.yan.latihan1;

import com.yan.latihan1.latihan.TodoList;

import static com.yan.latihan1.latihan.inputoutput.InputOutput.getFullName;
import static com.yan.latihan1.latihan.inputoutput.InputOutput.printFullname;

public class Main {
    public static void main(String[] args){
        String fullName = getFullName();
        printFullname(fullName);
        //trying.io();
        TodoList.todoList();
    }
}
