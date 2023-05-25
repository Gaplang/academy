package by.academy.homework1;

public class task4 {
	public static void main(String[] args) {

		int power = 0;
		int result = 1;
		while (result < 1000000) {
			System.out.println("2 to the power of: " + power + " = " + result);
			power = power + 1;
			result = result * 2;

		}
		System.out.println("The last power of '2' until '1_000_000' is: " + (power - 1));
	}
}