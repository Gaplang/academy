package by.academy.homework4.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomDateDemo {

	public static final Pattern DATE_FORMAT_DD_MM_YYYY = Pattern
			.compile("^(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-(([1-2]\\d{3}))$");

	protected static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	protected static boolean isValidDate(String inputDate) {
		Matcher matcher1 = DATE_FORMAT_DD_MM_YYYY.matcher(inputDate);
		return matcher1.matches();
	}

	public static LocalDate parse(String inputDate) {
		if (isValidDate(inputDate)) {
			return LocalDate.parse(inputDate, FORMATTER);
		}
		return null;
	}
}
