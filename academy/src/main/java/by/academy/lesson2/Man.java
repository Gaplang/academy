package by.academy.lesson2;

public class Man {

	String name;
	String hairColor;
	String passportNumber;

	int age;
	double weight;
	double height;

	public Man() {
		super();
	}

	public Man(String name, String hairColor, String passportNumber, int age, double weight, double height) {
		super();
		this.name = name;
		this.hairColor = hairColor;
		this.passportNumber = passportNumber;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public void grow() {
		age = age + 1;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", hair color: " + hairColor + " passport number " + passportNumber + " age: " + age
				+ " weight: " + weight + " height " + height;

	}
}
