package problems1000.problems100.problems10.problem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Primes {

	private static List<Long> primeList = new ArrayList<Long>();

	public Primes() {
		primeList.add(2L);
		primeList.add(3L);
	}

	public boolean isPrime(Long number) {
		Double numberSqrt = Math.sqrt(Double.valueOf(number));
		for (Long prime : primeList) {
			if (number % prime == 0) {
				return false;
			}
			if (prime > numberSqrt) {
				return true;
			}
		}
		Long nextPrime = getNextPrime();
		while (nextPrime <= numberSqrt) {
			if (number % nextPrime == 0) {
				return false;
			}
			nextPrime = getNextPrime();
		}
		return false;
	}

	public Long getLowestPrimeFactor(Long number) {
		Double numberSqrt = Math.sqrt(Double.valueOf(number));
		for (Long prime : primeList) {
			if (number % prime == 0) {
				return prime;
			}
			if (prime > numberSqrt) {
				return number;
			}
		}
		Long nextPrime = getNextPrime();
		while (nextPrime <= numberSqrt) {
			if (number % nextPrime == 0) {
				return nextPrime;
			}
			nextPrime = getNextPrime();
		}
		return number;
	}

	public List<Long> getPrimeListUntil(Long number) {
		Long nextPrime = this.getNextPrime();
		while(nextPrime < number) {
			nextPrime = this.getNextPrime();
		}
		return primeList.subList(0, this.getIndexOfFirstPrimeLessThan(number));
	}

	private Long getNextPrime() {
		Integer primeListSize = primeList.size();
		Long i = primeList.get(primeListSize - 1) + 2;
		while (true) {
			if (isPrime(i)) {
				primeList.add(i);
				return i;
			}
			i += 2;
		}
	}

	private Integer getIndexOfFirstPrimeLessThan(Long value) {
		int lo = 0;
		int hi = primeList.size() - 1;
		while (lo <= hi) {
			int mid = (hi + lo) / 2;
			if      (value < primeList.get(mid)) hi = mid - 1;
			else if (value > primeList.get(mid)) lo = mid + 1;
			else return mid;
		}
		return lo;
	}


	public Long getNthPrime(Integer n) {
		while(primeList.size() < n) {
			this.getNextPrime();
		}
		return primeList.get(n - 1);
	}

}
