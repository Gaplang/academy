package by.academy.homework1;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner sw = new Scanner(System.in);

		System.out.println("What number you want to see: ");

		int num1 = sw.nextInt();
		for (int i = 0; i < 10; i++) {

			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		}

	}
}