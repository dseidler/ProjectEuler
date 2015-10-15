package problems1000.problems100.problems10.problem1;

public class App {

	public static void main(String[] args) {
		Integer sum = 0;
		Integer ceiling = 1000;
		for (int i = 1; i < ceiling; i++) {
			if (i%3 == 0 || i%5==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
