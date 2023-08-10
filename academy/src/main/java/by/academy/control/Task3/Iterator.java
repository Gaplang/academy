package by.academy.control.Task3;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.NoSuchElementException;

	public class Iterator {
		public static void main(String[] args) throws Throwable {
			Iterator<Integer> i1 = Arrays.asList(4, 2, 0, 4, 6, 4, 9).iterator();
			Iterator<Integer> i2 = Arrays.asList(0, 9, 8, 7, 5).iterator();
			Iterator<Integer> i3 = Arrays.asList(1, 3, 5, 6, 7, 0, 9, 8, 4).iterator();

			Iterator<Integer> iterator = iterator(i1, i2, i3);
		}

		@SafeVarargs
		private static <T> Iterator<T> iterator(Iterator<T>... iterators) {
			return new Iterator<T>() {
				private final Iterator<Iterator<T>> iterator;
				private Iterator<T> currentIterator;

				{
					List<Iterator<T>> iteratorList = new ArrayList<>(iterators.length);
					Collections.addAll(iteratorList, iterators);
					iterator = iteratorList.iterator();
				}

				private void check() {
					if (currentIterator == null && iterator.hasNext())
						currentIterator = iterator.next();
				}

				@Override
				public boolean hasNext() {
					check();
					if (currentIterator == null)
						return false;
					if (currentIterator.hasNext())
						return true;

					if (iterator.hasNext())
						currentIterator = iterator.next();

					return currentIterator.hasNext();
				}

				@Override
				public T next() {
					check();
					if (currentIterator == null)
						throw new NoSuchElementException();

					if (!currentIterator.hasNext() && iterator.hasNext())
						currentIterator = iterator.next();

					return currentIterator.next();
				}
			};
		}
	}
