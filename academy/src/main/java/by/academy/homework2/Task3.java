package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first words: ");
		String w1 = scan.nextLine();
		System.out.println("Enter the second words: ");
		String w2 = scan.nextLine();
		scan.close();

		if (w1.length() % 2 == 0 && w2.length() % 2 == 0) {
			String nw1 = w1.substring(0, w1.length() / 2);
			String nw2 = w2.substring(w2.length() / 2);
			String f = nw1 + nw2;
			System.out.println(f);
		} else {
			System.out.println("Enter words consisting of an even number of letters!");
		}
	}
}
