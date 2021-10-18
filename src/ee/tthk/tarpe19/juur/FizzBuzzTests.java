package ee.tthk.tarpe19.juur;


import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	private FizzBuzz fb;
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void shouldReturnOneHundredNumbers() {
		assertEquals(100, fb.getNumbers().length);
	}
	
	@Test
	void shouldReturnNumbers1_100() {
		int [] expected = IntStream.range(1, 101).toArray();
		assertEquals(expected, fb.getNumbers());
	}
	
	@Test
	void shouldReturnFizzForMultipleOfThree() {
		assertEquals("Fizz", fb.convert(3)); 
	}
	
	@Test
	void shouldReturnFizzForMultipleOfFive() {
		assertEquals("Buzz", fb.convert(5)); 
	}
	
	@Test
	void shouldReturnFizzForMultipleOfFiveAndThree() {
		assertEquals("FizzBuzz", fb.convert(15)); 
	}
}
