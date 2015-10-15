package problems1000.problems100.problems20.problem15;

import java.math.BigInteger;

public class LatticePaths {
	
	private Long board[][];
	
	public LatticePaths(Integer i, Integer j) {
		board = new Long[i][j];
	}
	
	public LatticePaths() {
	}

	public Long calculateRoutes(Integer x, Integer y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i * j == 0) {
					board[i][j] = 1L;
				} else {
					board[i][j] = board[i-1][j] + board[i][j - 1];
				}
			}
		}
		board[0][0] = 0L;
		return board[x - 1][y - 1];
	}
	
	public Long calculateRoutes(Integer x) {
		Long product = 1L;
		for (int i = 1; i <= x; i++) {
			product *= (x + i) / i;
		}
		return product;
	}
	
}
