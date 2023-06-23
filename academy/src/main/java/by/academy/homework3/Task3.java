package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Write a date to check the correctness: ");
		String str = sc.nextLine();
		sc.close();

		Pattern pattern = Pattern
				.compile("^(0[1-9]|1\\d|2\\d|3[01])[\\/\\-](|\\-)(0[1-9]|1[0-2])[\\/\\-](|\\-)(19|20)\\d{2}$");
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());

	}
}
