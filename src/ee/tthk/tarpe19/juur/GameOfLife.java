package ee.tthk.tarpe19.juur;

import java.util.Random;

public class GameOfLife {
	
	Cell actual = new Cell();

	public Cell createCell(CellState state) {
		actual.state(state);
		return actual;
	}
	

}
