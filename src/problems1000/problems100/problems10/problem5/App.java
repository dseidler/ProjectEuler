package problems1000.problems100.problems10.problem5;

public class App {

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		App a = new App();
		Integer number = 1;
		for (int i = 1; i <= 20; i++) {
			number *= i / a.getMcm(number, i);
		}
		System.out.println(number);
		System.out.println(System.currentTimeMillis() - startTime);
	}

	public Integer getMcm(Integer a, Integer b) {
		if (a < b) {
			return getMcm(b, a);
		}
		if (a % b == 0) {
			return b;
		} else {
			return getMcm(b, a % b);
		}
	}
		
}
