package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	public static String PHONE_VERIFICATION = "^(\\+375|80)(29|25|44|33)(\\d{3})(\\d{2})(\\d{2})$";

	private static Pattern p;
	private static Matcher m;

	public BelarusPhoneValidator() {
		super();
	}

	public static void main(String[] args) {
		// Phone validation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Belarus number: ");
		String rbPhone = sc.nextLine();

		p = Pattern.compile(PHONE_VERIFICATION);
		m = p.matcher(rbPhone);
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
