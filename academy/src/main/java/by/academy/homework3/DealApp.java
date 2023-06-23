package by.academy.homework3;

public class DealApp {

	public static void main(String[] args) {

		Product[] products = new Product[10];
		products[0] = new Coke(20000.15, 12, "Cube", 89);
		products[1] = new Vine(" Poggio Felice ", 40, 1, " red ", 12.5);
		products[2] = new Headphone(200, 1, "Sony", "wireless earphones");

		System.out.println(products[0]);
		System.out.println(products[1]);
		System.out.println(products[2]);

	}

}
