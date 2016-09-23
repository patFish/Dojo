package dojo.numberWords;

import java.util.HashMap;

public class NumbersToWords {

	private HashMap<Integer, String> hashMapForNumberToStringConversion = new HashMap<>();

	private String[] firstPotenceArray = { "", "", "twenty" };
	private String[] muliplePotenceArray = { "", "hundred", "thousand" };

	private String convertedNumberString;
	private int convertNumber;

	public NumbersToWords() {
		this.convertedNumberString = "";
		this.convertNumber = 0;
		hashMapForNumberToStringConversion.put(1, "one");
		hashMapForNumberToStringConversion.put(2, "two");
		hashMapForNumberToStringConversion.put(3, "three");
		hashMapForNumberToStringConversion.put(4, "four");
		hashMapForNumberToStringConversion.put(5, "five");
		hashMapForNumberToStringConversion.put(6, "six");
		hashMapForNumberToStringConversion.put(7, "seven");
		hashMapForNumberToStringConversion.put(8, "eight");
		hashMapForNumberToStringConversion.put(9, "nine");
		hashMapForNumberToStringConversion.put(10, "ten");
		hashMapForNumberToStringConversion.put(11, "eleven");
		hashMapForNumberToStringConversion.put(12, "twelve");
		hashMapForNumberToStringConversion.put(13, "thirteen");
		hashMapForNumberToStringConversion.put(14, "fourteen");
		hashMapForNumberToStringConversion.put(15, "fifteen");
		hashMapForNumberToStringConversion.put(16, "sixteen");
		hashMapForNumberToStringConversion.put(17, "seventeen");
		hashMapForNumberToStringConversion.put(18, "eightteen");
		hashMapForNumberToStringConversion.put(19, "nineteen");

	}

	public String convertNumbersToString(int inputNumber) {

		// split Number in char except least 2 significant
		this.convertNumber = inputNumber;

		if (convertNumber > 19) {

			String numberAsString = "" + convertNumber;
			int lengthOfNumberAsString = numberAsString.length();
			System.out.println(lengthOfNumberAsString + "");

			convertedNumberString = firstPotenceArray[numberAsString.charAt(lengthOfNumberAsString - 2)] + " ";
			System.out.println(convertedNumberString);
			convertedNumberString += numberAsString.charAt(lengthOfNumberAsString);
			System.out.println(convertedNumberString);

		} else {
			convertedNumberString = hashMapForNumberToStringConversion.get(convertNumber);
		}

		// least two significant number < 12 or > 12

		return convertedNumberString;
	}

}
