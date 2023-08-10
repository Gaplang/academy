package by.academy.control.Task2;

import java.util.Scanner;

public class TestAirComp {

	public static void main(String[] args) {
		AirCompany airCompany = new AirCompany();
		System.out.println("Enter number of aircraft: ");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("U not enter number! Try again bro: ");
			sc.next();
		}
		int N = sc.nextInt();
		airCompany.addPlanes(Plane.of(N));
		sc.close();
		System.out.println("----- List of airline aircraft -----");
		airCompany.printPlanes();
		System.out.println("Total capacity of the aircraft : " + airCompany.totalCapacity());
		System.out.println("Total load capacity of the aircraft : " + airCompany.totalCarrying());
		airCompany.sortPlane();
		System.out.println("----- List of aircraft by flight range -----");
		airCompany.printPlanes(plane -> plane.getMaxDistance() >= 750 && plane.getMaxDistance() <= 999,
				Plane::toString);
		System.out.println("----- List of aircraft by capacity -----");
		airCompany.printPlanes(plane -> plane.getCapacity() >= 50 && plane.getCapacity() <= 200, Plane::toString);
	}

}