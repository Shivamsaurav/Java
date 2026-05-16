package companies.epam;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeNumberCalculatorTest {

	PrimeNumberCalculator calculator = new PrimeNumberCalculator();
	
	@Test
	void testPrimeNumber() {
		assertTrue(calculator.isPrime(2));
		assertTrue(calculator.isPrime(3));
		assertTrue(calculator.isPrime(5));
		assertTrue(calculator.isPrime(7));
		assertTrue(calculator.isPrime(11));
	}
	
	@Test
	void testNonPrimeNumbers() {
		assertFalse(calculator.isPrime(1));
		assertFalse(calculator.isPrime(4));
		assertFalse(calculator.isPrime(6));
		assertFalse(calculator.isPrime(9));
		assertFalse(calculator.isPrime(15));
	}
	
	@Test
	void testNegativeNumbers() {
		assertFalse(calculator.isPrime(-5));
		assertFalse(calculator.isPrime(-10));
	}
	
	@Test
	void testZero() {
		assertFalse(calculator.isPrime(0));
	}
}
