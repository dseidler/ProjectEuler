package problems1000.problems100.problems20.problem13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {
		String base = "/home/daniel/Public/Learning/Workspace_Project_Euler/ProjectEuler/src/problem0013/";
		String fileName = base + "numbers.txt";
		BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
		List<BigInteger> numberList = new ArrayList<BigInteger>();
		BigInteger sum = new BigInteger("0");
		while(inputStream.ready()) {
			sum = sum.add(new BigInteger(inputStream.readLine()));
		}
		System.out.println(sum);
		System.out.println(String.valueOf(sum).substring(0, 10));
	}

}
