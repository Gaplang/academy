package by.academy.homework4.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array<T> {
	private T[] array;
	private int n;

	Array() {
		super();
		array = (T[]) new Object[16];
		n = 0;
	}

	Array(int i) {
		super();
		this.array = (T[]) new Object[i];
	}

	void add(T element) {
		if (n == array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[n++] = element;
	}

	T get(int index) {
		if (index > 0 || index >= n) {
			System.out.println("Does not exist");
		}
		return array[index];
	}

	T getLast() {
		int n1 = n;
		return array[--n1];
	}

	T getFirst() {
		return array[0];
	}

	void lengthOfArray() {
		System.out.println("Length of array is: " + array.length);
	}

	void lastIndex() {
		int n1 = n;
		System.out.println("Last index is: " + (--n1));
	}

	T[] remove(int index) {
		if (index < 0 || index >= n) {
			System.out.println("Does not exist");
		}
		List<T> list = new ArrayList<T>(Arrays.asList(array));
		list.remove(index);

		array = (T[]) list.toArray(new Object[list.size()]);
		n--;
		return array;
	}

	T[] removeObject(T object) {
		List<T> list = new ArrayList<T>(Arrays.asList(array));
		list.remove(object);
		array = (T[]) list.toArray(new Object[list.size()]);
		n--;
		return array;
	}

	@Override
	public String toString() {
		return "Array " + Arrays.toString(array) + ", n=" + n;
	}

	static class Test {
		public static void main(String[] args) {
			Array<Object> array = new Array<Object>();
			array.add('S');
			array.add(0);
			array.add('S');
			array.add('S');
			array.add(0);
			array.add(7);
			System.out.println("Task 1: ");
			System.out.println(array.toString());
			System.out.println("Task 2: ");
			System.out.println("Element by index: " + array.get(0));
			System.out.println("Task 3: ");
			System.out.println("Last index of array is: " + array.getLast());
			System.out.println("Task 4: ");
			System.out.println("First index of array is: " + array.getFirst());
			System.out.println("Task 5: ");
			array.lengthOfArray();
			System.out.println("Task 6: ");
			array.lastIndex();
			System.out.println("Task 7: ");
			array.remove(0);
			System.out.println("Task 8: ");
			System.out.println(array.toString());

		}
	}
}