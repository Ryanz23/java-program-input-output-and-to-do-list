package com.yan.latihan1;

import com.yan.latihan1.latihan.TodoList;
import com.yan.latihan1.latihan.inputoutput.InputOutput;

import static com.yan.latihan1.latihan.inputoutput.InputOutput.getFullName;
import static com.yan.latihan1.latihan.inputoutput.InputOutput.printFullname;

public class Main {
    public static void main(String[] args){
        InputOutput.io();

//        String fullName = getFullName();
//        printFullname(fullName);
        TodoList.todoList();
    }
}
