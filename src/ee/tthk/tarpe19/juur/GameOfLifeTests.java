package ee.tthk.tarpe19.juur;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

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
	
	/*@Test
	void createDeadCell() {
		GameOfLife gol = new GameOfLife();
		Cell actual = gol.createCell(CellState.DEAD);
		assertEquals(CellState.DEAD, actual.getState());
	}
	
	@Test
	void createRandomCell() {
		GameOfLife gol = new GameOfLife();
		List<Cell> created = new ArrayList<>();
		boolean living = false;
		boolean dead = false;
		for (int i = 0; i < 10; i++) {
			Cell actual = gol.createCell();
			if(actual.getState()==CellState.LIVING);
				living=true;
			if(actual.getState()==CellState.DEAD);
				dead=true;
		}
		assertTrue(living && dead);
		
	}*/

}
