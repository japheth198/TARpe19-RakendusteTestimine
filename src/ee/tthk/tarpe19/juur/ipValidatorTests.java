package ee.tthk.tarpe19.juur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ipValidatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturn_False_GivenEmptyStringParameter() {
		IpValidator validator = new IpValidator();
		assertFalse(validator.ValidateIpv4Address(""));
	}

}
