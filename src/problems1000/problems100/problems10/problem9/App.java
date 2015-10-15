package problems1000.problems100.problems10.problem9;

public class App {
	
	public static void main(String[] args) {
		App app = new App();
		Integer k = 1;
		Integer sum = 1000;
		Integer product = 0;
		for (int i = 1; i < sum / 3; i++) {
			for (int j = i; j < sum / 2; j++) {
				k = sum - i - j;
				if (app.isAPythagoreanTriplet(Double.valueOf(i), Double.valueOf(j), Double.valueOf(k))) {
					product = i * k * j;
					break;
				}
			}
			if (product != 0) {
				break;
			}
		}
		System.out.println(product);
	}
	
	
	public boolean isAPythagoreanTriplet(Double a, Double b, Double c) {
		Double max = Math.max(Math.max(a, b),c);
		return Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) == 2*Math.pow(max, 2);
	}

}
