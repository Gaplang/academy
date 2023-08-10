package by.academy.control.Task3;

import java.util.Arrays;
import java.util.Iterator;

public class IterIterator<N> implements Iterator<N> {

	private Iterator<Iterator<N>> iters;
	private Iterator<N> ptr;

	public IterIterator(Iterator<N>... iters) {
		reset(iters);

	}

	public void reset(Iterator<N>... iters) {
		this.iters = Arrays.asList(iters).iterator();
		ptr = this.iters.hasNext() ? this.iters.next() : null;
	}

	@Override
	public boolean hasNext() {
		return ptr != null;
	}

	@Override
	public N next() {
		N n = ptr.next();

		while (ptr != null && !ptr.hasNext()) {
			ptr = this.iters.hasNext() ? this.iters.next() : null;
		}

		return n;
	}
}