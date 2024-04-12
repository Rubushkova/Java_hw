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
        int fNumber = number / 100;
        int sNumber = (number / 10) % 10;
        int tNumber = number % 10;
        System.out.println(number + " -> " + fNumber + ","+ sNumber + "," + tNumber);





    }


}
