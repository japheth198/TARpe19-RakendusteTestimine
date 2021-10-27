package ee.tthk.tarpe19.juur;

import java.util.Arrays;

public class IpValidatorDriver {

	public static void main(String[] args) {
		int[] numbers =  Arrays
				.stream("1.2.3.4".split("\\."))
				.mapToInt(Integer::parseInt)
				.toArray();
		for( int i : numbers) {
			System.out.println(i);
		}
	}


}
