package ee.tthk.tarpe19.juur;

public class FizzBuzz {

	public int[] getNumbers() {
		return new int[100];
	}

	public Object convert(int i) {
		if (i % 3 == 0) {
            if (i % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
		
	}
}
