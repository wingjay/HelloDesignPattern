/**
* We should set a calculateStrategy into this manager before we do calculate.
*/
public class CalculateStrategyManager {

	private CalculateStrategy calculateStrategy;

	public CalculateStrategyManager(CalculateStrategy calculateStrategy) {
		setCalculateStrategy(calculateStrategy);
	}

	public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
		this.calculateStrategy = calculateStrategy;
	}

	public Integer calculate(Integer first, Integer second) {
		if (calculateStrategy != null) {
			return calculateStrategy.calculate(first, second);
		}
		return Integer.MIN_VALUE;
	}

}