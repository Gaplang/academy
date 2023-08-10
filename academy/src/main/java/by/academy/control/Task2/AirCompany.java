package by.academy.control.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class AirCompany {

	private final List<Plane> planes;

	public AirCompany() {
		planes = new ArrayList<>();
	}

	public void addPlanes(List<Plane> planes) {
		this.planes.addAll(planes);
	}

	public void sortPlane() {
		Collections.sort(planes);
	}

	public long totalCarrying() {
		return total(Plane::getCarrying);
	}

	public long totalCapacity() {
		return total(Plane::getCapacity);
	}

	private long total(final ToIntFunction<Plane> function) {
		return planes.stream().mapToInt(function).sum();
	}

	public void printPlanes() {
		printPlanes(null, Plane::toString);
	}

	public void printPlanes(Predicate<Plane> predicate, Function<Plane, String> planeFunction) {
		planes.stream().filter(plane -> predicate == null || predicate.test(plane))
				.forEachOrdered(plane -> System.out.println(planeFunction.apply(plane)));
	}

}