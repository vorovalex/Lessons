package com.company.lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1) Создать метод convert, который должен конвертировать гривны в доллары. В метод должен приходить один аргумент (к-во гривен). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double f = Double.parseDouble (bf.readLine());

        System.out.println("convert = $" + convert(f));

        System.out.println("percent (110%)= "+ percent(f)+" bonus(10%): "+f * 0.1 );

        System.out.println(print(""+f));


    }
    public static double convert(double grn){//тут не очень понял как гривна подвязалась к числу которое ввожу
        return grn / 27.3;
    }

    public static double percent(double f){
        return f + f * 0.1;}
    public static String print (String s){//не очень понял зачем "return s"
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        return s;

    }
    }


