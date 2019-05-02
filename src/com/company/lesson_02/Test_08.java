package com.company.lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
Пример:
Коля получает 3000 через 5 лет.
*/
public class Test_08 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int in1 = Integer.parseInt(bf.readLine());
        int in2 = Integer.parseInt(bf.readLine());
        System.out.println("Коля получает "+ in1 + " через " + in2 + " лет." );
    }
}
