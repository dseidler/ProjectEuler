package problems1000.problems100.problems20.problem14;

import java.util.HashMap;
import java.util.Map;

public class Collatz {
	
	private Map<Long, Long> iterationsNecesary = new HashMap<Long, Long>();
	
	public Collatz() {
		iterationsNecesary.put(1L, 0L);
	}
	
	public Long getNext(Long n) {
		if (n % 2 == 0) {
			return n/2;
		} else {
			return 3*n+1;
		}
	}
	
	public Long calculateIterationsNeccesary(Long n) {
		if (iterationsNecesary.get(n) == null) {
			iterationsNecesary.put(n, this.calculateIterationsNeccesary(this.getNext(n)) + 1);
		} 
		return iterationsNecesary.get(n);
	}

}
