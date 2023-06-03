package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words: ");
		int a = scan.nextInt();

		String[] array = new String[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Enter the word by the number" + (i + 1));
			array[i] = scan.next();

		}
		scan.close();
		int min = 0;
		for (int i = 0; i < a; i++) {
			if (array[i].length() < array[min].length())
				min = i;
		}
		System.out.println("The word with a minimum number of different characters is:  " + array[min]);

	}
}
