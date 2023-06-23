package by.academy.homework3;

import java.util.Scanner;

public class DataBirth implements Validator {

	public DataBirth() {
		super();
	}

	public static void main(String[] args) {
		String dataBirth = null;
		boolean dataBirthl_valid = false;

		Scanner input = new Scanner(System.in);
		boolean dataBirth_valid = false;
		do {
			System.out.println("Enter your data birth: ");
			dataBirth = input.nextLine();

			if (dataBirth.matches("^(0[1-9]|1\\d|2\\d|3[01])[\\/\\-](|\\-)(0[1-9]|1[0-2])[\\/\\-](|\\-)(19|20)\\d{2}$"))
				dataBirth_valid = true;
			else
				dataBirthl_valid = false;

			if (dataBirth_valid)
				System.out.println(" You enter data right!!");
			else {
				if (!dataBirth_valid)
					System.out.println(" Re-enter your data birth");

			}

		} while (!dataBirth_valid);
		input.close();

	}

	public boolean validate(String input) {
		return false;
	}

}
