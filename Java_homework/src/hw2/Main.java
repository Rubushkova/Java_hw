package hw2;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int a = 15;
        int b = 10;
        double c = 2.5;
        System.out.println( " a + b + c = " + ( a + b + c ));
        System.out.println( " a - b - c = " + ( a - b - c ));
        System.out.println( " a * b * c = " + ( a * b * c ));
        System.out.println( " a / b / c = " + ( a / b / c ));
        System.out.println( " a % b % c = " + ( a % b % c ));

        int number = 345;
        System.out.println(number);
        System.out.println( number / 100);
        System.out.println((number / 10) % 10 );
        System.out.println(number % 10);
        System.out.println( number + "->" + (number / 100 ) + "," + (number / 10) % 10  + "," + (number % 10));




    }


}
