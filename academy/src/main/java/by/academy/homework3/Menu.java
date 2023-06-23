package by.academy.homework3;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		printMenu();
		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();
		Product[] array = new Product[10];
		Deal d = new Deal();

		while (sc != 0) {

			switch (sc) {
			case 0:
				return;
			case 1:
				Product p = createProduct(scan);
				if (p == null) {
					break;
				}
				d.addProduct(p);
				System.out.println(" add product ");
				break;
			}
			printMenu();
			sc = scan.nextInt();
		}
		System.out.println(" final program ");
		scan.close();
	}

	public static Product createProduct(Scanner scan) {
		System.out.println("enter pro type");
		String type = scan.next();
		switch (type) {
		case "wine":
			System.out.println(" Name of wine: ");
			String name = scan.next();
			System.out.println(" How much its cost (price): ");
			int price = scan.nextInt();
			System.out.println(" What the quantity: ");
			int quantity = scan.nextInt();
			System.out.println(" Color of wine is: ");
			String color = scan.next();
			System.out.println(" what about content: ");
			int content = scan.nextInt();
			return new Vine(name, price, quantity, color, content);
		}
		return null;
	}

	public static void printMenu() {
		System.out.println(" 0 - ex product ");
		System.out.println(" 1 - add product ");
	}
}
