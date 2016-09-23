package agile.roman;

import java.util.HashMap;

public class RomanNumeralConverter {

	private static final int MINIMUM_LENGTH_OF_ARRAY = 1;
	HashMap<Character, Integer> hashMapOfRomanCharacterToArabicValues = new HashMap<>();
	private char[] romanCharacterArray;

	public RomanNumeralConverter() {
		hashMapOfRomanCharacterToArabicValues.put('I', 1);
		hashMapOfRomanCharacterToArabicValues.put('V', 5);
		hashMapOfRomanCharacterToArabicValues.put('X', 10);
		hashMapOfRomanCharacterToArabicValues.put('L', 50);
		hashMapOfRomanCharacterToArabicValues.put('C', 100);
		hashMapOfRomanCharacterToArabicValues.put('D', 500);
		hashMapOfRomanCharacterToArabicValues.put('M', 1000);
	}

	public int convertTwoArabicNumerals(String romanNumeralString) {
		setWorkingCharacterArray(romanNumeralString);
		return addRomanCharacterFromLeftToRight();
	}

	private void setWorkingCharacterArray(String romanNumeralString) {
		romanCharacterArray = romanNumeralString.toCharArray();
	}

	private int addRomanCharacterFromLeftToRight() {
		int resultValue = 0;
		for (int runnerVariable = 0; runnerVariable < romanCharacterArray.length; runnerVariable++) {
			int tempResultValue = getArabicValueForRomanCharacter(romanCharacterArray[runnerVariable]);
			if (isRomanNumberReducePrecondition(runnerVariable)) {
				tempResultValue -= getReductionValueBasedOnPositionInCharacterArray(runnerVariable);
			}
			resultValue += tempResultValue;
		}
		return resultValue;
	}

	private boolean isRomanNumberReducePrecondition(int runnerVariable) {
		return isArrayBiggerMinimumAndRunnerBiggerOne(runnerVariable)
				&& isLeftOfCurrentRomanCharacterBiggerThanCurrent(runnerVariable);
	}

	private boolean isArrayBiggerMinimumAndRunnerBiggerOne(int runnerVariable) {
		return romanCharacterArray.length >= MINIMUM_LENGTH_OF_ARRAY && runnerVariable > 0;
	}

	private boolean isLeftOfCurrentRomanCharacterBiggerThanCurrent(int runnerVariable) {
		return getArabicValueForRomanCharacter(romanCharacterArray[runnerVariable]) > getLeftRomanValue(runnerVariable);
	}

	private Integer getReductionValueBasedOnPositionInCharacterArray(int runnerVariable) {
		return 2 * getLeftRomanValue(runnerVariable);
	}

	private Integer getLeftRomanValue(int runnerVariable) {
		return getArabicValueForRomanCharacter(romanCharacterArray[runnerVariable - 1]);
	}

	private Integer getArabicValueForRomanCharacter(Character character) {
		return hashMapOfRomanCharacterToArabicValues.get(character);
	}

}
