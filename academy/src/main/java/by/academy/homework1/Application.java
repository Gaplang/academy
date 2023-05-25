package by.academy.homework1;

public class Application {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.nickname = "Hulk";

		cat1.initials = 'H';
		System.out.println(cat1);

		Cat cat2 = new Cat("Izek");
		System.out.println(cat2);

		cat2.eat();
		cat2.sleep();
		cat2.walk();

		cat1.grow();
		cat1.grow();
		cat1.grow();

		System.out.println(cat1.age);

	}

}