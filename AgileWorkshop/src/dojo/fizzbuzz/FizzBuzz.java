package dojo.fizzbuzz;

import java.util.HashMap;

public class FizzBuzz {

	HashMap<Integer, String> fizzBuzzMap = new HashMap<Integer, String>();
	{
		fizzBuzzMap.put(2, "Foo");
		fizzBuzzMap.put(3, "Fizz");
		fizzBuzzMap.put(5, "Buzz");
	}

	private int returnValue;

	private int getReturnValue() {
		return returnValue;
	}

	private void setReturnValue(int returnValue) {
		this.returnValue = returnValue;
	}

	public String getLineToInputMaximum(int max) {
		String result = "";

		for (int runner = 1; runner <= max; runner++) {
			result += getStringForInteger(runner);
			if (isNotMax(max, runner)) {
				result += "\n";
			}
		}
		return result;
	}

	private boolean isNotMax(int max, int runner) {
		return runner < max;
	}

	public String getStringForInteger(int inputValue) {
		String result = "";
		int getMultipleofMapInt = getMultipleOfMapInt(inputValue);
		if (isMapContainValue(getMultipleofMapInt)) {
			result = getMapValue(getMultipleofMapInt);
			return result;
		}
		return "" + inputValue;
	}

	private String getMapValue(int getMultipleofMapInt) {
		return fizzBuzzMap.get(getMultipleofMapInt);
	}

	private boolean isMapContainValue(int getMultipleofMapInt) {
		return fizzBuzzMap.containsKey(getMultipleofMapInt);
	}

	private int getMultipleOfMapInt(int inputValue) {
		setReturnValue(0);

		fizzBuzzMap.forEach((Integer a, String b) -> {
			if (inputValue % a == 0) {
				setReturnValue(a);
			}
		});

		return getReturnValue();
	}

}
