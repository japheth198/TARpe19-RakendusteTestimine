package ee.tthk.tarpe19.juur;

import java.util.Arrays;

public class FizzBuzz {

	private int[] numbers;
	public String[] getNumbers() {
		numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;
		}
		return (String[]) Arrays.stream(numbers)
				.mapToObj(this::getFizzBuzz)
				.toArray(String[]::new);
	}
	
	private String getFizzBuzz(int number) {
		/*if (number%5==0 && number%3==0) 
			return "FizzBuzz";
		if (number%5==0) 
			return "Buzz";*/
		if (number%3==0) 
			return "Fizz";
		return String.valueOf(number);
	}
	
}
