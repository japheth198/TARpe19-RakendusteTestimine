package ee.tthk.tarpe19.juur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameOfLifeTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void createLivingCell() {
		GameOfLife gol = new GameOfLife();
		Cell actual = gol.createCell(CellState.LIVING);
		assertEquals(CellState.LIVING, actual.getState());
	}

}
