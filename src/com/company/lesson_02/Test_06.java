package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    Ввести с клавиатуры три числа, вывести на экран максимальное из них.
*/
public class Test_06 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter num (1):");
        int num = Integer.parseInt(bf.readLine());
        System.out.println("enter num (2):");
        int num1 = Integer.parseInt(bf.readLine());
        System.out.println("enter num (3):");
        int num2 = Integer.parseInt(bf.readLine());
        if  (num>num1 && num>num2){ System.out.println("Max number: " + num); }
        else if(num1>num && num1>num2){ System.out.println("Max number: " + num1); }
        else  { System.out.println("Max number: " + num2);}
    }}
