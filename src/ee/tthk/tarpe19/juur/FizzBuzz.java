package ee.tthk.tarpe19.juur;

public class FizzBuzz {

	public int[] getNumbers() {
		return new int[100];
	}

	public Object convert(int i) {
		if (i % 3 == 0) {
			return "Fizz";
		}
		return i;
		
	}
}
