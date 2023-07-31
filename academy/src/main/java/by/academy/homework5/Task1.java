package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(0);
		System.out.printf("The original arrayList: " + arrayList + "\n" + "\n" + "After remove duplicates: ");
		System.out.print(removeDuplicates(arrayList));
	}

	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<T>(collection);
	}

}
