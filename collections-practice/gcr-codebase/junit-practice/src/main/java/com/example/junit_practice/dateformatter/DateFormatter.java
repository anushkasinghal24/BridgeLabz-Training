package com.example.junit_practice.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
	
	public String formatDate(String input) {
		try {
			LocalDate date=LocalDate.parse(input);
			return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			
		}
		catch(DateTimeParseException e) {
			 throw new IllegalArgumentException("Invalid date format");
		}
	}

}