package com.company.lesson_03;

public class Test_02 {
    public static void main (String[] args){
        int s = sum(20,30);
        int b = sum1(50, 20);
        int c = sum2(10, 20);
        int d = sum3(100,4);
        System.out.println(sum(30,23));
        System.out.println(sum1(50,20));
        System.out.println(sum2(10,20));
        System.out.println(sum3(100,4));
        System.out.println(sum3(545542164, 654));
    }

    public static int sum(int number1, int number2){
        return number1+number2; }

    public static int sum1(int number1, int number2){
        return number1-number2;}

    public static int sum2(int number1, int number2){
        return number1*number2;}

    public static int sum3(int number1, int number2){
        return number1/number2;}

}
