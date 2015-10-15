package problems1000.problems100.problems10.problem6;

public class App {
	
	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		Long firstSum = 0L;
		Long secondSum = 0L;
		for (int i = 1; i <= 100; i++) {
			firstSum += (long) Math.pow(i,2);
			secondSum += i;
		}
		secondSum = (long) Math.pow(secondSum, 2);
		System.out.println(secondSum - firstSum);
		System.out.println(System.currentTimeMillis() - startTime);
	}

}
