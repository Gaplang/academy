package by.academy.homework1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How much was the purchase? ");
		double purchase = scan.nextDouble();
		System.out.println("How old is the buyer? ");
		int age = scan.nextInt();
		scan.close();

		if (purchase < 100) {
			System.out.println("The discount is 5%. The amount of payment including the discount is equal to: "
					+ (purchase - purchase * 0.05));
		}

		else if ((purchase >= 100) && (purchase < 200)) {
			System.out.println("The discount is 7%. The amount of payment including the discount is equal to: "
					+ (purchase - purchase * 0.07));
		} else if ((purchase >= 200) && (purchase < 300) && (age >= 18)) {
			System.out.println("The discount is 16%. The amount of payment including the discount is equal to: "
					+ (purchase - purchase * 0.16)); // с учетом что старше 18 (либо 18) лет 12% + 4% = 16%;
		}

		else if ((purchase >= 300) && (purchase < 400) && (age < 18)) {
			System.out.println("The discount is 9%. The amount of payment including the discount is equal to: "
					+ (purchase - purchase * 0.09)); // с учетом что младше 18 лет 12% - 3% = 9%;
		}

		else if ((purchase >= 300) && (purchase < 400)) {
			System.out.println("The discount is 15%. The amount of payment including the discount is equal to: "
					+ (purchase - purchase * 0.15));
		}

		else if ((purchase >= 400)) {
			System.out.println("The discount is 20%. The amount of payment including the discount is equal to: "
					+ (purchase - purchase * 0.20));
		}

	}

}
