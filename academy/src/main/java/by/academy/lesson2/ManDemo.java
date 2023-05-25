package by.academy.lesson2;

public class ManDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man1 = new Man();
		Man man2 = new Man();

		man1.age = 1;
		System.out.println(man1);
		System.out.println(man2);

		man2.grow();
		System.out.println(man2);

		man2.grow();
		System.out.println(man2);

		man2.grow();
		System.out.println(man2);

	}

}
