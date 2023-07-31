package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

	public static void main(String... args) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		LinkedList<Double> linkedList = new LinkedList<Double>();
		final int a = 1000000;
		final int b = 1000;
		for (int i = 0; i < a; i++) {
			arrayList.add(Math.random());
			linkedList.add(Math.random());
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < b; i++) {
			arrayList.get((int) (Math.random() * (a - 1)));
		}
		System.out.println("Time spent getting 100,000 items in ArrayList (milliseconds): "
				+ (System.currentTimeMillis() - startTime));

		startTime = System.currentTimeMillis();
		for (int i = 0; i < b; i++) {
			linkedList.get((int) (Math.random() * (a - 1)));
		}
		System.out.println("Time spent getting 100,000 items in LinkedList (milliseconds): "
				+ (System.currentTimeMillis() - startTime));
		System.out.println("ArrayList is faster than LinkedList if I randomly access its elements. "
				+ "ArrayList has direct references to every element in the list, so it can get the nth element in constant time. "
				+ "LinkedList-has to traverse the list from the beginning to get to the nth element.");
	}
}