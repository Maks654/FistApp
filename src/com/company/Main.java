package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*int b = 0;
		boolean isExit = false;
		while (!isExit) {
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			int a = scanner.nextInt();
			isExit = s.equals("Exit");
			b = b + a;
			System.out.println(b);// write your code here

		}*/
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























































































































