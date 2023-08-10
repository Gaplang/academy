package by.academy.control.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Plane implements Comparable<Plane> {

	private final Integer capacity;
	private final Integer maxDistance;
	private final Integer carrying;

	public static List<Plane> of(int numb) {
		final List<Plane> planes = new ArrayList<>(numb);
		for (int i = 0; i < numb; i++)
			planes.add(new Plane(random(1, 200), random(650, 1100), random(1, 50)));
		return planes;
	}

	public Plane(Integer capacity, Integer maxDistance, Integer carrying) {
		this.capacity = capacity;
		this.maxDistance = maxDistance;
		this.carrying = carrying;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public Integer getMaxDistance() {
		return maxDistance;
	}

	public Integer getCarrying() {
		return carrying;
	}

	private static int random(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

	@Override
	public int compareTo(Plane o) {
		return this.maxDistance.compareTo(o.getMaxDistance());
	}

	@Override
	public String toString() {
		return "Capacity : " + capacity + ", carrying : " + carrying + ", distance : " + maxDistance;
	}

}