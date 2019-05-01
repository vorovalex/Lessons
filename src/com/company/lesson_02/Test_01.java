package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_01 {
    public static void main (String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));

    String str = bufferedReader.readLine();

    String str2 = bufferedReader.readLine();

    int number = Integer.parseInt(str2);

    int number2 = Integer.parseInt(bufferedReader.readLine());



    System.out.println("text:" + str);

    System.out.println(number*2);

    System.out.println(number * number2);



    }
}
