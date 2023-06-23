package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email implements Validator {

	public static void main(String[] args) {
		String email = null;
		boolean email_valid = false;

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter your email: ");
			email = input.nextLine();

			if (email.matches("[\\w]+@[\\w]+\\.[a-zA-Z]{2,3}"))
				email_valid = true;
			else
				email_valid = false;

			if (email_valid)
				System.out.println(" Welcome User!!");
			else {
				if (!email_valid)
					System.out.println(" Re-enter your email: ");

			}

		} while (!email_valid);
		input.close();

	}

	public boolean validate(String input) {
		return false;
	}

}
