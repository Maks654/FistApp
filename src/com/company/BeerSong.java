package com.company;

import java.util.Scanner;

public class BeerSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beerNum = (int) (Math.random() * 100);
        byte beerSum;
        String word = "бутылок (бутылки)";
        while (true) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " пива на стене");
            }
            else {
                System.out.println("Нет пива на стене");
                return;
            }
            System.out.println("Какое количество пива возьмешь?");
            beerSum = scanner.nextByte();
            beerNum = beerNum - beerSum;
            if (beerNum < 0) {
                System.out.println("Ты не можешь взять больше чем есть!");
                beerNum = beerNum + beerSum;
            }
        }

    }


}
