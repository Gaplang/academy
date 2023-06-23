package by.academy.homework3;

public class Cigarette extends Product {

	String producer;
	boolean isBlack;

	public Cigarette(String name, double price, double quantity, String producer, boolean isBlack) {
		super(name, price, quantity);
		this.producer = producer;
		this.isBlack = isBlack;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public boolean isBlack() {
		return isBlack;
	}

	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isBlack ? 1231 : 1237);
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cigarette other = (Cigarette) obj;
		if (isBlack != other.isBlack)
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

	public String toString() {
		return "Cigarette [producer=" + producer + ", isBlack=" + isBlack + "]";
	}

	public double discount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
