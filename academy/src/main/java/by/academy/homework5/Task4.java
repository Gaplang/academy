package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {

		List<Integer> schoolGrades = new ArrayList<Integer>();
		Random randomNumber = new Random();
		for (int i = 0; i < 10; i++) {
			schoolGrades.add(randomNumber.nextInt(11));
		}
		System.out.println("List of school grades: " + schoolGrades);
		schoolGrades.removeIf(new Predicate<Integer>() {
			public boolean test(Integer mark) {
				return mark < 6;
			}
		});

		System.out.println("List of school grades heigh than 5: " + schoolGrades + "\n");
		int maxGrade = schoolGrades.get(0);
		Iterator<Integer> iterator = schoolGrades.iterator();
		while (iterator.hasNext()) {
			int maxSearch = iterator.next();
			if (maxSearch > maxGrade) {
				maxGrade = maxSearch;
			}
		}
		System.out.print("Max school grade: " + maxGrade);
	}
}