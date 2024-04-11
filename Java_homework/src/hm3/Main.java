package hm3;

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
    }
}