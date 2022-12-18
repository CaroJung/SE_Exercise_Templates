package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 2 + 3;
		int actualResult = calculator.add(2, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult = 2 - 3;
		int actualResult = calculator.sub(2, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 3 * 4;
		int actualResult = calculator.multiply(3, 4);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		float expectedResult = (float) 15 / 5;
		float actualResult = calculator.divide(15, 5);
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Exception exception = assertThrows(ArithmeticException.class, () -> {
			calculator.divide(5, 0);
		});
		
		String expectedMessage = "ZeroDivisionError";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
}