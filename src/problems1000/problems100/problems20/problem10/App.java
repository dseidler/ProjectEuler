package problems1000.problems100.problems20.problem10;

import java.util.List;

import problems1000.problems100.problems10.problem3.Primes;

public class App {

	public static void main(String[] args) {
		Primes primes = new Primes();
		Long limit = 2000000L;
		List<Long> primeList = primes.getPrimeListUntil(limit);
		Long sum = 0L;
		for (Long prime : primeList) {
			sum += prime;
		}
		System.out.println(sum);
		// 142913828922
	}
	
	public Long impl1() {
		Primes primes = new Primes();
		Long limit = 2000000L;
		List<Long> primeList = primes.getPrimeListUntil(limit);
		Long sum = 0L;
		for (int i = 0; primeList.get(i) < limit; i++) {
			sum += primeList.get(i);
		}
		return sum;
		// 142913828922
	}

}
