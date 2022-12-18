package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {1912, 1934, 1951, 1988,1996})
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		Calendar calendar = new Calendar(year);
		boolean expectedResult = gregorianCalendar.isLeapYear(year);
		boolean actualResult = calendar.isLeapYear();
		
		assertEquals(expectedResult, actualResult);
	}

// Implement test cases for the equivalent partitions 
	
	@ParameterizedTest
	@ValueSource(ints = {1600,1738, 1865,1883,1899})
	public void Should_return_false_for_years_below_1901(int year) {
		Calendar calendar = new Calendar(year);
		assertFalse(calendar.isLeapYear());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1912, 1932, 1948, 1988,1996})
	public void Should_return_true_for_years_above_1900_and_below_2001(int year) {
		Calendar calendar = new Calendar(year);
		assertTrue(calendar.isLeapYear());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2004, 2008, 2012, 2016, 2020})
	public void Should_return_false_for_years_above_2000(int year) {
		Calendar calendar = new Calendar(year);
		assertFalse(calendar.isLeapYear());
	}
	


}
