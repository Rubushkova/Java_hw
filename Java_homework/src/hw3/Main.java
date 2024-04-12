package hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bведите первое слово с четным количеством букв: ");
        String firstWord = scanner.next();
        System.out.println("Введите второе слово с четным количеством букв : ");
        String secondWord = scanner.next();
        String firstHalf = firstWord.substring(0, firstWord.length() / 2);
        String secondHalf = secondWord.substring(secondWord.length() / 2);
        String resultWord = firstHalf + secondHalf;
        System.out.println( "Итоговое слово : " + resultWord);



        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        long firstNumber = scanner.nextLong();
        System.out.println("Введите второе число: ");
        long secondNumber = scanner.nextLong();

        System.out.println("Сумма: " + (firstNumber + secondNumber));
        System.out.println("Разность: " + (firstNumber - secondNumber));
        System.out.println("Произведение: " + (firstNumber * secondNumber));
        System.out.println("Частное: " + (firstNumber / secondNumber));




        Scanner scanner2 = new Scanner(System.in);
        System.out.println(" Введите ваше имя ");
        String name = scanner2.nextLine();
        System.out.println("Добрый день, " + name + "!");
        System.out.println("Ваше имя начинается с символа " + name.charAt(0));
        System.out.println("Ваше имя заканчивается на символ " + name.charAt(name.length() - 1 ));
    }
}