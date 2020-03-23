package ua.lviv.iot.searchCredits;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditSearcher {
	public static String findCredits(String line) {
		String pattern = "(((\\d{4}\\s){4})|\\d{16})";
		Pattern creditFinder = Pattern.compile(pattern);
		Matcher matchingValue = creditFinder.matcher(line);
		String credits = new String();
		if (matchingValue.find()) {
			do {
				System.out.println("Found value: " + matchingValue.group(0));
				credits = credits + matchingValue.group(0).trim() + " ";
			} while (matchingValue.find());
		} else {
			System.out.println("No matches");
		}
		return credits;

	}
}