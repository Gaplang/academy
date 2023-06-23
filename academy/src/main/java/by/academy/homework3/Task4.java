package by.academy.homework3;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Task4 {

	public void parseAndPrintDate(String inputDate) {
		SimpleDateFormat dateFormat;
		if (inputDate.contains("/")) {
			dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		} else {
			dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		}
		try {
			Date date = dateFormat.parse(inputDate);
			SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Day: " + outputFormat.format(date));
			outputFormat.applyPattern("MM");
			System.out.println("Month: " + outputFormat.format(date));
			outputFormat.applyPattern("yyyy");
			System.out.println("Year: " + outputFormat.format(date));
		} catch (ParseException e) {
			System.out.println("Error parsing date.");
		}
	}
}