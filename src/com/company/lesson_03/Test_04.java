package com.company.lesson_03;
/*
Введите с клавиатуры три целых числа.
Выведите их на экран в порядке возрастания, используя if/else.
*/

//Реализовать метод compare(int a).
//Метод должен выводить строку на экран "Число меньше 5",
// если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр
// метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и.

/*Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то прибавить единицу. Вывести результат на экран. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        compare(a);
        positiveNegative(a);
        stairs (a, b, c);
    }
    public static void compare(int a){
        if(a > 5){
        System.out.println("'a' higher than 5!");
        }
        else if(a < 5){
            System.out.println("'a' lower than 5!");
        }
        else if(a == 5){System.out.println("'a' equally 5!");
        }

/*Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то прибавить единицу. Вывести результат на экран. */
    }
    public static void positiveNegative (int a){
        if ( a > 0 ){
            System.out.println("You won - double! double! double! " + a * 2);
        }
        else if ( a < 0 ){
            System.out.println("You loser - xaxaxa! xaxaxa! xaxaxa! " + (a + 1));
        }}


/*
Введите с клавиатуры три целых числа.
Выведите их на экран в порядке возрастания, используя if/else.
*/

        public static void stairs (int a, int b, int c){
        if(a > b && b > c ){
            System.out.println(c+" "+b+" "+a);
        }
        else if (b > c && c > a){
            System.out.println(a+" "+c+" "+b);
        }
        else if (c > a && a > b){
            System.out.println(b+" "+a+" "+c);
        }
        else if (a > c && c > b){
            System.out.println(b+" "+c+" "+a);
        }
        else if (b > a && a > c){
            System.out.println(c+" "+a+" "+b);
        }
        else if (c > b && b > a){
            System.out.println(a+" "+b+" "+c);
        }
        }
    }


