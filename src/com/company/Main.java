package com.company;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Введите количество углов");
		Scanner scan = new Scanner(System.in);
		int NumberOfCorners = scan.nextInt();
		int [] NumberOC = new int[NumberOfCorners];
		int P = 0;
		for (int Array = 0; Array < NumberOfCorners; Array++)
		{
			System.out.println("Введите размер стороны " + (Array + 1));
			Scanner scanner = new Scanner(System.in);
			NumberOC [Array] = scanner.nextInt();
			P = P + NumberOC [Array];
		}
	System.out.println(P);

	}

}























































































































