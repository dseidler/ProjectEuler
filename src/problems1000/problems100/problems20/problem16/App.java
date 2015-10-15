package problems1000.problems100.problems20.problem16;

import java.math.BigInteger;

public class App {

	public static void main(String[] args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		String numberString = String.valueOf(number);
		Long sum = 0L;
		for (int i = 0; i < numberString.length(); i++) {
			sum += Long.valueOf(numberString.charAt(i) - '0');
		}
		System.out.println(sum);
		// 1366
	}

}
