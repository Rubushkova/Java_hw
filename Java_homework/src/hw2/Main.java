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


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите ваше имя ");
        String name = scanner.nextLine();
        System.out.println("Добрый день, " + name + "!");
        System.out.println("Ваше имя начинается с символа " + name.charAt(0));
        System.out.println("Ваше имя заканчивается на символ " + name.charAt(name.length() - 1 ));

    }


}
