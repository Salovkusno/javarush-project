package com.javarush.task.pro.task15.task1512;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(new StringBuffer(scanner.nextLine()).reverse().toString());
        String result = outputStream.toString();
        System.out.println(result);
       //напишите тут ваш код
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}