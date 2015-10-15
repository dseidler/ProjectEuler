package problems1000.problems100.problems10.problem3;

import java.util.HashMap;
import java.util.Map;

public class Factorization {
	
	Primes primes = new Primes();
	
	public HashMap<Long, Integer> factorize(Long number)  {
//		if (number < 1) {
//			throw new Exception("The number is less than 1");
//		}
		HashMap<Long, Integer> factors = new HashMap<Long, Integer>();
		while(number != 1) {
			Long lpf = primes.getLowestPrimeFactor(number);
			number /= lpf;
			if (factors.get(lpf) == null) {
				factors.put(lpf, 1);
			} else {
				factors.put(lpf, factors.get(lpf) + 1);
			}
		}
		return factors;
	}
	
	public Integer calculateDivisorsQuantity(Long number) throws Exception {
		Map<Long, Integer> factorization = this.factorize(number);
		Integer divisorsQuantity = 1;
		for(int i = 0; primes.getNthPrime(i+1) < Math.sqrt(number.doubleValue()); i++) {
			if (factorization.get(primes.getNthPrime(i + 1)) != null) {
				divisorsQuantity *= factorization.get(primes.getNthPrime(i + 1)) + 1;
			}
		}
		return divisorsQuantity;
	}

}
