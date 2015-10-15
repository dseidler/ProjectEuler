package problems1000.problems100.problems10.problem2;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Integer fibonacci[] = new Integer[3];
		fibonacci[0] = 1;
		fibonacci[1] = 2;
		Integer limit = 4000000;
		Integer sum = 2;
		while(fibonacci[1] < limit) {
			fibonacci[2] = fibonacci[0] + fibonacci[1];
			fibonacci[0] = fibonacci[1];
			fibonacci[1] = fibonacci[2];
			if (fibonacci[1] % 2 == 0) {
				sum += fibonacci[1];
			}
		}
		System.out.println(sum);
	}
	
	private Integer impl1() {
		List<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(1);
		fibonacci.add(2);
		Integer limit = 4000000;
		Integer index = 1;
		Integer sum = 2;
		while(fibonacci.get(index) < limit) {
			fibonacci.add(fibonacci.get(index) + fibonacci.get(index - 1));
			index++;
			if (fibonacci.get(index) % 2 == 0) {
				sum += fibonacci.get(index);
			}
		}
		return sum;
		// 4613732
	}
}
