package problems1000.problems100.problems20.problem15;

public class App {

	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.impl1());
	}
	
	public Long impl1() {
		Integer dimension = 21;
		LatticePaths latticePaths = new LatticePaths(dimension, dimension);
		return latticePaths.calculateRoutes(dimension, dimension);
		// 137846528820
	}
	
	public Long impl2() {
		Integer dimension = 21;
		LatticePaths latticePaths = new LatticePaths();
		return latticePaths.calculateRoutes(dimension);
		// 1366
	}

}
