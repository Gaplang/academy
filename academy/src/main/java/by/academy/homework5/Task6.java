package by.academy.homework5;

public class Task6 {

	public static void main(String[] args) {

		int[] array = new int[8];
		for (int i = 0; i < array.length + 2; i++) { // add elem through a loop & random
			try {
				array[i] = (int) (Math.random() * 77);
				System.out.println(array[i]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Expand the array" + " " + e);
			}
		}

	}

}
