package com.company;

import java.util.Scanner;

public class BeerSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество бутылок: ");
        int beerNum = scanner.nextInt();
        int beerSum;
        String word = "бутылок (бутылки)";
        while (beerNum >= 0) {
            if (beerNum == 1) {
                word = "Бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("какое количество пива возьмешь?");
            beerSum = scanner.nextInt();
            beerNum = beerNum - beerSum;
            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " пива на стене");
            }
            else {
                System.out.println("Нет пива на стене");
            }
        }


    }


}
