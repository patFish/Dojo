package agile.roman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralConverterTest {

	// @Ignore
	@Test
	public void romanNumeralsConverterTest1() {

		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("I");

		// test
		assertEquals(1, arabicNumerals);

	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest2() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("II");

		// test
		assertEquals(2, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest3() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("III");

		// test
		assertEquals(3, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest4() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("IV");

		// test
		assertEquals(4, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest5() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("V");

		// test
		assertEquals(5, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest6() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("VI");

		// test
		assertEquals(6, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest7() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("VII");

		// test
		assertEquals(7, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest9() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("IX");

		// test
		assertEquals(9, arabicNumerals);
	}

	// @Ignore
	@Test
	public void romanNumeralsConverterTest11() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("XI");

		// test
		assertEquals(11, arabicNumerals);
	}

	@Test
	public void romanNumeralsConverterTest42() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("XLII");

		// test
		assertEquals(42, arabicNumerals);
	}

	public void romanNumeralsConverterTest99() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("XCIX");

		// test
		assertEquals(99, arabicNumerals);
	}

	public void romanNumeralsConverterTest2013() {
		// when
		RomanNumeralConverter converter = new RomanNumeralConverter();
		// method under test
		int arabicNumerals = converter.convertTwoArabicNumerals("MMXIII");

		// test
		assertEquals(2013, arabicNumerals);
	}
}
