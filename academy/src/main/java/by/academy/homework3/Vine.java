package by.academy.homework3;

public class Vine extends Product {
	String color;
	double content;

	public Vine(String name, double price, double quantity, String color, double content) {
		super(name, price, quantity);
		this.color = color;
		this.content = content;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getContent() {
		return content;
	}

	public void setContent(double content) {
		this.content = content;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(content);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vine other = (Vine) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(content) != Double.doubleToLongBits(other.content))
			return false;
		return true;
	}

	public String toString() {
		return "Vine [color=" + color + ", content=" + content + "]";
	}

	public double discount() {
		return 0.1;
	}

}
