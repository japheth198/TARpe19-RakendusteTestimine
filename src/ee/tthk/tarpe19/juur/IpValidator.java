package ee.tthk.tarpe19.juur;

import java.util.Arrays;

public class IpValidator {

	public Boolean ValidateIpv4Address(String ipString) {
		if(hasThreeDots(ipString) && 
			hasFourNumbers(ipString) &&
			areNumbersInRange0_255(ipString) &&
			isNumberInRange(getFirstNumber(ipString), 1, 254) &&
			isNumberInRange(getLastNumber(ipString), 1, 254)){
			return true;
		}
		return false;
	}
	
	private int getLastNumber(String ipString) {
		return getNumbers(ipString)[3];
	}

	private int getFirstNumber(String ipString) {
		return getNumbers(ipString)[0];
	}

	private boolean isNumberInRange(int number, int min, int max) {
		return number >= min &&
				number <= max;
	}

	private boolean areNumbersInRange0_255(String ipString) {
		return Arrays.stream(getNumbers(ipString)).allMatch(nr-> nr>=0 && nr <=255);
	}

	private boolean hasFourNumbers(String ipString) {
		return getNumbers(ipString).length == 4;
	}

	private boolean hasThreeDots(String ipString) {
		return ipString.chars().filter(c->c=='.').count()==3;
	}

	public int[] getNumbers(String string) {
		return Arrays
				.stream(string.split("\\."))
				.mapToInt(Integer::parseInt)
				.toArray();
	}
	

}
