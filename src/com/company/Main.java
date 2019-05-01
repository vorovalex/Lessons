package com.company;

//public protected default private
// int [] =4 byte

public class Main {
    public static int a =30; //[35]
    public int age = 20;          // [] [] [] [] [] [] []

    public static void main(String[] args) {
        byte b = 127; // 1 byte = 8 bit = 2^8 =256 ot -128 do 127 Byte
        short s = 32000; // 2 byte = 16 bit = 2^16    Short
        char c = 'a'; // 2 byte = 16 bit = 2^16    Character
        int i = 56556565; // 4 byte = 32 bit = 2^32 Integer
        boolean bool = true; // 4 byte true/false 32 bit Boolean
        float f = 32.4f; // 4 byte   Float
        long l = 5465465465464546645L; // 8 byte = 32 bit = 2^64 Long
        double d = 32.4; // 8 byte Double
        String str = "30";
        str = "50";
        Integer num = 435;

        int nm = Integer.parseInt(str);
        System.out.println("Sum = " + nm * 2+ ", " + str);
        System.out.format("Sum =  %d, %s" , nm+2 , str, f);
        System.out.println();

        System.out.println(sum(20,30));
        System.out.println(sum(25684,561));



        System.out.println("---------------------");
        Main m1 = new Main();
        Main m2 = new Main();
        System.out.println(m1.age);//20
        System.out.println(m2.age);//20
        System.out.println(m1.a);//30
        System.out.println(m2.a);//30
        m1.age = 50;
        m2.age = 120;
        m1.a = 70;
        System.out.println(m1.age);//50
        System.out.println(m2.age);//20
        System.out.println(m1.a);//70
        System.out.println(m2.a);//70
        System.out.println("------------------------");

    }
    public static int sum(int number1, int number2){
        return number1+number2;
    }
}
