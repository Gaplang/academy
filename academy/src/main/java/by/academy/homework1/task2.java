package by.academy.homework1;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sw = new Scanner(System.in);
		System.out.println("Enter the data type: ");

		String dataType = sw.nextLine();
		System.out.println("Enter the value of the variable: ");
		String variable = sw.nextLine();
		sw.close();

		switch (dataType) {

		case "int":
			int intValuble = Integer.parseInt(variable);
			int remains = intValuble % 2;
			System.out.println("The remainder of the division by 2 is: " + remains);
			break;

		case "double":
			double doubleValue = Double.parseDouble(variable);
			double remains1 = doubleValue * 0.7;
			System.out.println("70% of the number is: " + remains1);
			break;

		case "float":
			float floatValue = Float.parseFloat(variable);
			float square = floatValue * floatValue;
			System.out.println("The square of the number is: " + square);
			break;

		case "char":
			char charValue = variable.charAt(0);
			int charSymbol = (int) charValue;
			System.out.println("The symbol code is: " + charSymbol);
			break;

		case "String":
			System.out.println("Hello: " + variable);
			break;

		default:
			System.out.println("Unsupported type");
			break;

		}
	}
}