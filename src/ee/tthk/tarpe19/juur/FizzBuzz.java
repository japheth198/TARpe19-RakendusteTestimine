package ee.tthk.tarpe19.juur;

public class FizzBuzz {

	private int[] numbers;
	public int[] getNumbers() {
		numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;
		}
		return numbers;
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
