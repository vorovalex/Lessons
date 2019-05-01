package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_06 {
    public static void main(String[] args) throws IOException {
     /*
    Ввести с клавиатуры три числа, вывести на экран максимальное из них.
*/
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter num:");
        int num = Integer.parseInt(bf.readLine());
        System.out.println("enter num:");
        int num1 = Integer.parseInt(bf.readLine());
        System.out.println("enter num:");
        int num2 = Integer.parseInt(bf.readLine());
        if (num > num1){
            System.out.println(num);
        }
        else if (num1>num2){
            System.out.println(num1);
        }
           else {
            System.out.println(num2); }
    }
}
