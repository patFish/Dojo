package dojo.numberWords;

import org.junit.Assert;
import org.junit.Test;

public class NumbersToWordsTest {

	@Test
	public void writeOne() {
		NumbersToWords numbersToWords = new NumbersToWords();

		int inputNumber = 1;
		String expectedWord = "one";

		String answer = numbersToWords.convertNumbersToString(inputNumber);
		Assert.assertEquals(expectedWord, answer);

	}

	@Test
	public void writeTwo() {
		NumbersToWords numbersToWords = new NumbersToWords();

		int inputNumber = 2;
		String expectedWord = "two";

		String answer = numbersToWords.convertNumbersToString(inputNumber);
		Assert.assertEquals(expectedWord, answer);

	}

	@Test
	public void writeTwelve() {
		NumbersToWords numbersToWords = new NumbersToWords();

		int inputNumber = 12;
		String expectedWord = "twelve";

		String answer = numbersToWords.convertNumbersToString(inputNumber);
		Assert.assertEquals(expectedWord, answer);

	}

	@Test
	public void writeNineTeen() {
		NumbersToWords numbersToWords = new NumbersToWords();

		int inputNumber = 19;
		String expectedWord = "nineteen";

		String answer = numbersToWords.convertNumbersToString(inputNumber);
		Assert.assertEquals(expectedWord, answer);

	}

	@Test
	public void writeTwentyOne() {
		NumbersToWords numbersToWords = new NumbersToWords();

		int inputNumber = 21;
		String expectedWord = "twenty one";

		String answer = numbersToWords.convertNumbersToString(inputNumber);
		Assert.assertEquals(expectedWord, answer);

	}
}
