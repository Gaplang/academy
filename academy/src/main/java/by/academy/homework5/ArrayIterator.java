package by.academy.homework5;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {
	private Integer[][] m;
	private int i, j;

	public ArrayIterator() {
		super();
	}

	public ArrayIterator(Integer[][] m) {
		this.m = m;
	}

	public boolean hasNext() {
		return i < m.length && j < m[i].length;
	}

	public Integer next() {
		Integer r = m[i][j++];
		if (j >= m[i].length) {
			i++;
			j = 0;
		}
		return r;
	}

	public static void main(String[] args) {
		Integer[][] array = new Integer[][] { { 12 }, { 11, 10, 9, 8, }, { 7, 6 }, { 5, 4, 3, 2, 1, 0 } };
		ArrayIterator i = new ArrayIterator(array);
		for (; i.hasNext();) {
			System.out.println(i.next());
		}
	}
}