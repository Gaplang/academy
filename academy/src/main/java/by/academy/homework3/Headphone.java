package by.academy.homework3;

public class Headphone extends Product {

	protected String type;

	public Headphone(double price, double quantity, String name, String type) {
		super(name, price, quantity);
		this.type = type;

	}

	public double discount() {
		return 0.9;
	}
}
