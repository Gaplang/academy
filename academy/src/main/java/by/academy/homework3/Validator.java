package by.academy.homework3;

import java.util.regex.Pattern;

public interface Validator {
	deafult boolean isValid (String value) {
		return getPattern().matcher(value);}
	Pattern getPattern();
}
