package problems1000.problems100.problems20.problem12;

import problems1000.problems100.problems10.problem3.Factorization;

public class App {

	public static void main(String[] args) throws Exception {
		TriangleNumbers triangleNumbers = new TriangleNumbers();
		Factorization factorization = new Factorization();
		Integer divisorsQuatity = 500;
		Integer i = 1;
		Long triangleNumber = triangleNumbers.getNthTriangleNumber(i);
		while (factorization.calculateDivisorsQuantity(triangleNumber) < divisorsQuatity) {
			i++;
			triangleNumber = triangleNumbers.getNthTriangleNumber(i);
		}
		System.out.println(triangleNumber);
		System.out.println(factorization.calculateDivisorsQuantity(triangleNumber));
	}

}
