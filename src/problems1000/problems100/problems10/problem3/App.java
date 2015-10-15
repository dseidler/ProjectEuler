package problems1000.problems100.problems10.problem3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static List<Long> primeList = new ArrayList<Long>();
	public static List<Long> primeList2 = new ArrayList<Long>();

	public static void main(String[] args) {
		Long maxValue = 600851475143L;
		Primes primes = new Primes();
		Long prime = primes.getLowestPrimeFactor(maxValue);
		while(prime <= Math.sqrt(maxValue)) {
			while(maxValue % prime == 0) {
				maxValue /= prime;
			}
			prime = primes.getLowestPrimeFactor(maxValue);
		}
		System.out.println(prime);
	}

	private boolean isPrime2(Long number) {
		return this.generatePrimeListUntil(number).contains(number);
	}

	private List<Long> generatePrimeListUntil(Long number) {
		Integer lastPrimeIndex = this.primeList2.size() - 1;
		for (Long i = this.primeList2.get(lastPrimeIndex); i < number; i++) {
			if (isPrime3(i)) {
				this.primeList2.add(i);
			}
		}
		return primeList2;
	}

	private Boolean isPrime3(Long number) {
		for (Long prime : primeList2) {
			if (number <= Math.sqrt(Double.valueOf(prime))) {
				return true;
			}
			if (number % prime == 0) {
				return false;
			}
		}
		if (number < 2) {
			return false;
		}
		return true;
	}

	private Long impl1() {
		Long maxValue = 600851475143L;
		App p = new App();
		List<Long> primeList = p.generatePrimeList(maxValue);
		Long aux = maxValue;
		Long largestPrimeFactor = 1L; 
		for (Long prime : primeList) {
			while (aux % prime == 0) {
				aux /= prime;
				largestPrimeFactor = prime;
			}
		}
		if (largestPrimeFactor == 1L) {
			return maxValue;
		} else {
			return largestPrimeFactor;
		}
	}

	public List<Long> generateListUntil(Long until) {
		for (Long i = 2L; i <= until; i++) {
			if (isPrime(i)) {
				this.primeList.add(i);
			}
		}
		return this.primeList;
	}

	public List<Long> generatePrimeList(Long until) {
		return this.generateListUntil(Long.valueOf((long) Math.sqrt(until)));
	}

	private boolean isPrime(Long number) {
		for (Long prime : primeList) {
			if (number <= Math.sqrt(Double.valueOf(prime))) {
				return true;
			}
			if (number % prime == 0) {
				return false;
			}
		}
		if (number < 2) {
			return false;
		}
		return true;
	}

}
