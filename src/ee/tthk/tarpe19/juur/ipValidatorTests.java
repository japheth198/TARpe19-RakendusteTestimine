package ee.tthk.tarpe19.juur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ipValidatorTests {

	private IpValidator validator;
	@BeforeEach
	void setUp() throws Exception {
		validator = new IpValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturn_False_GivenEmptyStringParameter() {
		assertFalse(validator.ValidateIpv4Address(""));
	}
	
	@Test
	void shouldBe_True_GivenStringWithThreeDots() {
		assertTrue(validator.ValidateIpv4Address("1.2.3.1"));
	}

	@Test
	void shouldReturnFourNumbersGivenStringWithThreeDots() {
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4"));
	}
	
	@Test
	void shouldBe_False_GivenStringWithThreeNumbersAndDots() {
		assertFalse(validator.ValidateIpv4Address("1.2.3."));
	}
	
	@Test
	void shouldBe_False_GivenStringWithFourNumbersNotInRange0_255() {
		assertFalse(validator.ValidateIpv4Address("1.2.3.257"));
		assertFalse(validator.ValidateIpv4Address("1.2.300.4"));
		assertFalse(validator.ValidateIpv4Address("1.256.3.4"));
		assertFalse(validator.ValidateIpv4Address("312.2.3."));
	}
	
	@Test
	void shouldBe_False_GivenIPstartingWithZero() {
		assertFalse(validator.ValidateIpv4Address("0.2.3.4"));
	}
	
	@Test
	void shouldBe_False_GivenIPstartingWith255() {
		assertFalse(validator.ValidateIpv4Address("255.2.3.4"));
	}
	
	@Test
	void shouldBe_False_GivenIPendingWithZero() {
		assertFalse(validator.ValidateIpv4Address("1.2.3.0"));
	}
	
	@Test
	void shouldBe_False_GivenIPendingWith255() {
		assertFalse(validator.ValidateIpv4Address("1.2.3.255"));
	}
	
}
