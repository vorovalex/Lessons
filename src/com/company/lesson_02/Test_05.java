package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_05 {

    /*
    Ввести с клавиатуры два числа, вывести на экран минимальное из них.
*/
    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");

        int num1 = Integer.parseInt(bf.readLine());
        System.out.println("Enter number 2: ");
        int num2 = Integer.parseInt(bf.readLine());

        if (num1 > num2 ){
            System.out.println(num2);
        }
        else {
            System.out.print("Answer - minimal is : ");
            System.out.print(num1);

        }
        }







    }





