package by.academy.homework4.Task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CustomDate {

	private Year year;
	private Month month;
	private Day day;
	private LocalDate date;
	boolean isLeapYear;

	public CustomDate() {
		super();
	}

	public CustomDate(String scannerDate) {
		this.date = LocalDate.parse(scannerDate, CustomDateDemo.FORMATTER);
		this.year = new Year(scannerDate);
		this.month = new Month(scannerDate);
		this.day = new Day(scannerDate);
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isLeapYear() {
		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		return localDate.isLeapYear();
	}

	public static void countDaysBetweenDates(CustomDate firstDate, CustomDate secondDate) {
		System.out.println("Days between First Date and Second Date:"
				+ ChronoUnit.DAYS.between(firstDate.getDate(), secondDate.getDate()));
	}

	public void getDayOfWeek(CustomDate date) {
		LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
		switch (localDate.getDayOfWeek()) {
		case SUNDAY:
			System.out.println(DayOfWeek.SUNDAY.toString());
			break;
		case MONDAY:
			System.out.println(DayOfWeek.MONDAY.toString());
			break;
		case TUESDAY:
			System.out.println(DayOfWeek.TUESDAY.toString());
			break;
		case WEDNESDAY:
			System.out.println(DayOfWeek.WEDNESDAY.toString());
			break;
		case THURSDAY:
			System.out.println(DayOfWeek.THURSDAY.toString());
			break;
		case FRIDAY:
			System.out.println(DayOfWeek.FRIDAY.toString());
			break;
		case SATURDAY:
			System.out.println(DayOfWeek.SATURDAY.toString());
			break;
		}
	}

	public class Year {
		private int year;

		public Year() {
			super();
		}

		public Year(String scannerDate) {
			super();
			this.year = Integer.parseInt(scannerDate.substring(6, 10));
		}

		public int getYear() {
			return year;
		}

		public String toString() {
			return "Year = " + year;
		}

	}

	public class Month {
		private int month;

		public Month() {
			super();
		}

		public Month(String scannerDate) {
			super();
			this.month = Integer.parseInt(scannerDate.substring(3, 5));
		}

		public int getMonth() {
			return month;
		}

		public String toString() {
			return "Month = " + month;
		}

	}

	public class Day {
		private int day;

		public Day() {
			super();
		}

		public Day(String scannerDate) {
			super();
			this.day = Integer.parseInt(scannerDate.substring(0, 2));
		}

		public int getDay() {
			return day;
		}

		public String toString() {
			return "Day = " + day;
		}

	}

	public String toString() {
		return "CustomDate  : " + year + ", " + month + ", " + day + ", " + date;
	}

}
