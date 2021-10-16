package ee.tthk.tarpe19.juur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void shouldReturnOneHundredNumbers() {
		FizzBuzz fb=new FizzBuzz();
		assertEquals(100, fb.getNumbers().length);
	}
	@Test
	void shouldReturnFizzForMultipleOfThree() {
		FizzBuzz fb=new FizzBuzz();
		assertEquals("Fizz", fb.convert(3)); 
	}
}
