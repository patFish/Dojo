package dojo.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzbuzz1;
	private String expectedResult;

	@Before
	public void setup() {  
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void testSimpleLine() throws Exception {
		assertEquals("Bar", fizzbuzz.getStringForInteger(3));
	}

	@Test
	public void testSimpleLineBuzz() throws Exception {
		assertEquals("Buzz", fizzbuzz.getStringForInteger(5));
	}

	@Test
	public void testMultiLineTo3() throws Exception {
		int max = 3;
		expectedResult = "1\nFoo\nFizz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}

	@Test
	public void testMultiLineTo4() throws Exception {
		int max = 3;
		expectedResult = "1\nFoo\nFizz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}

	@Test
	public void testMultiLineTo5() throws Exception {
		int max = 5;
		expectedResult = "1\nFoo\nFizz\nFoo\nBuzz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}

	@Test
	public void testMultiLineTo10() throws Exception {
		int max = 10;
		expectedResult = "1\nFoo\nFizz\nFoo\nBuzz\nFizzFoo\n7\nFoo\nFizz\nBuzz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}

	@Test
	public void testMultiLineTo13() throws Exception {
		int max = 10;
		expectedResult = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}

	@Test
	public void testMultiLineTo15() throws Exception {
		int max = 10;
		expectedResult = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}

	@Test
	public void testMultiLineTo23() throws Exception {
		int max = 10;
		expectedResult = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz";
		assertEquals(expectedResult, fizzbuzz.getLineToInputMaximum(max));
	}
}
