package by.academy.homework4.Task4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator implements Iterator<String> {
	List<String> list;
	int pos = 0;

	public ListIterator(List<String> list) {
		this.list = list;
	}

	public boolean hasNext() {
		while (pos < list.size()) {
			if (list.get(pos).startsWith("B"))
				return true;
			pos++;
		}
		return false;

	}

	public String next() {
		if (hasNext())
			return list.get(pos++);
		throw new NoSuchElementException();
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Berserk", "bob", "Babayaga", "Aharlie");
		ListIterator itr = new ListIterator(list);

		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
