package by.academy.homework3;

public class Coke extends Product {
	protected int purity;

	public Coke(double price, double quantity, String name, int purity) {
		super(name, price, quantity);
		this.purity = purity;
	}

	public double discount() {
		if (quantity > 10) {
			return 0.8;
		} else

			return 1;
	}

}
