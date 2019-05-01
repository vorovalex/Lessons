package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Test_01 {
   public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter text: ");
       String str = bufferedReader.readLine();
       System.out.println("Enter a number 1: ");
       String str2 = bufferedReader.readLine();
       int number = Integer.parseInt(str2);
       System.out.println("Enter a number 2: ");
       int number2 = Integer.parseInt(bufferedReader.readLine());
       System.out.println(number*2);
       System.out.println(number*number2);
       System.out.println("Text: "+ str);




    }
}
