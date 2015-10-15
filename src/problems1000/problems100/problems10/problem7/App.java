package problems1000.problems100.problems10.problem7;

import problems1000.problems100.problems10.problem3.Primes;

public class App {

	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		Primes p = new Primes();
//		System.out.println(p.getNthPrime(225556));
		System.out.println(p.getNthPrime(10001));
		System.out.println(System.currentTimeMillis() - startTime);
	}

}
