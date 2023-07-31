package by.academy.homework4.Task1;

public enum DayOfWeek {
	MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(1);

	int number;

	private DayOfWeek(int number) {
		this.number = number;
	}

	public double getDayOfWeek() {
		return number;
	}

	public void setDayOfWeek(int number) {
		this.number = number;
	}

}