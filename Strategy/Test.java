/**
* Test CalculateStrategy
*/
public class Test {

	public static void main(String[] args) {
		CalculateStrategyManager manager = new CalculateStrategyManager(new PlusCalculateStrategy());
		System.out.println("test PlusCalculateStrategy 10 + 20 = " + manager.calculate(10, 20));

		manager.setCalculateStrategy(new SubCalculateStrategy());
		System.out.println("test SubCalculateStrategy 10 - 20 = " + manager.calculate(10, 20));

	}

}