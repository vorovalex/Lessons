package com.company.lesson_02;

public class Test_07 {
    /*
В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
Знаки нужно расставить только в строчке, в которой объявляется переменная result.
Порядок следования переменных в этой строке изменять нельзя.
Перед каждой переменной должен стоять знак либо плюс, либо минус.
int result = ? a + b ? c ? d;
a = 1;
b = 3;
c = 9;
d = 27;
*/
    public static void main(String[] args){

       int a = 1;
       int b = 3;
       int c = 9;
       int d = 27;
       int result = - a + b - c + d;
        System.out.println(result);
    }
}
