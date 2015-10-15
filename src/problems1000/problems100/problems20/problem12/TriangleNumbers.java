package problems1000.problems100.problems20.problem12;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumbers {
	
	private List<Long> triangleNumberList = new ArrayList<Long>();
	
	public TriangleNumbers() {
		this.triangleNumberList.add(1L);
	}
	
	private Long getNextTriangleNumber() {
		Integer size = this.triangleNumberList.size();
		Long triangleNumber = size + this.triangleNumberList.get(size - 1) + 1L;
		this.triangleNumberList.add(triangleNumber);
		return triangleNumber;
	}
	
	public Long getNthTriangleNumber(Integer n) {
		while(triangleNumberList.size() < n) {
			this.getNextTriangleNumber();
		}
		return triangleNumberList.get(n - 1);
	}

}
