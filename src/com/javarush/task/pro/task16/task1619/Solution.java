package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String result = date.format(localDateTime);
        System.out.println(result);//напишите тут ваш код
    }
}
