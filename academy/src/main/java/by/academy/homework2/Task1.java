package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the first word: ");
		String s1 = sc.next();
		System.out.println("Write the second word: ");
		String s2 = sc.next();
		boolean check = checkResult(s1, s2);
		System.out.println("Result " + check);

	}

	public static boolean checkResult(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;

		}
		int[] a = new int[128];
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			a[c]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			a[c]--;
			if (a[c] < 0) {
				return false;
			}
		}

		return true;

	}
}
