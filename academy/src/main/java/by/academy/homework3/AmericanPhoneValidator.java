package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	public static String PHONE_VERIFICATION = "^(\\+1)[0-9]{9}$";

	private static Pattern p;
	private static Matcher m;

	public static void main(String[] args) {
		// Phone validation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the US number: ");
		String usPhone = sc.nextLine();

		p = Pattern.compile(PHONE_VERIFICATION);
		m = p.matcher(usPhone);
		boolean isPhoneValid = m.matches();

		if (!isPhoneValid) {
			System.out.println("The Phone number is NOT valid!");
			return;
		}
		System.out.println("The Phone number is valid!");
	}

	public boolean validate(String input) {
		return false;
	}

}
