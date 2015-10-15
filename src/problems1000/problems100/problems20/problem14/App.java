package problems1000.problems100.problems20.problem14;

public class App {

	public static void main(String[] args) {
		Collatz collatz = new Collatz();
		Long limit = 1000000L;
		Long maxIterations = 0L;
		Long number = 0L;
		for (Long i = 1L; i < limit; i++) {
			Long iterations = collatz.calculateIterationsNeccesary(i);
			if (iterations > maxIterations) {
				maxIterations = iterations;
				number = i;
			}
		}
		System.out.println(number);
	}

}
