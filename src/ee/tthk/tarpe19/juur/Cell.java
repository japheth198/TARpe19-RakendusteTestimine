package ee.tthk.tarpe19.juur;

public class Cell {

	private CellState state;
	private int num;
	
	public void state(CellState state) {
		this.state = state;
	}
	public CellState getState() {
		return state;
	}
	
	/*public void addNeighbours(int num) {
		this.num = num;
	}
	public int getNeighbours() {
		return num;
	}*/

}
