package ee.tthk.tarpe19.juur;


import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	private FizzBuzz fb;
	String[] expected1_100;
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
		expected1_100 = (String[])IntStream
				.range(1, 101)
				.mapToObj(String::valueOf)
				.toArray(String[]::new);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void shouldReturnOneHundredNumbers() {
		assertEquals(100, fb.getNumbers().length);
	}
	
	
	
	@Test
	void shouldReturnFizzForNumbersDividibleBy3() {
		String[] actual = fb.getNumbers();
		for (int i = 0; i < expected1_100.length; i++) {
			if(Integer.valueOf(expected1_100[i]) % 3 == 0 &&
					Integer.valueOf(expected1_100[i]) % 5 != 0) {
				assertEquals("Fizz", actual[i]);
			}
		}	
	}
		
	@Test
	void shouldReturnFizzForNumbersDividibleBy5() {
		String[] actual = fb.getNumbers();
		for (int i = 0; i < expected1_100.length; i++) {
			if(Integer.valueOf(expected1_100[i]) % 5 == 0 && 
					Integer.valueOf(expected1_100[i]) % 3 != 0) {
				assertEquals("Buzz", actual[i]);
			}
		}
	}
	
	/*@Test
	void shouldReturnFizzForNumbersDividibleBy5or3() {
		String[] actual = fb.getNumbers();
		for (int i = 0; i < expected1_100.length; i++) {
			if(Integer.valueOf(expected1_100[i]) % 5 == 0 && 
					Integer.valueOf(expected1_100[i]) % 3 == 0) {
				assertEquals("FizzBuzz", actual[i]);
			}
		}
	}*/
	
}
