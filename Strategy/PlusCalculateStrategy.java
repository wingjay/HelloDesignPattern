public class PlusCalculateStrategy implements CalculateStrategy {
	@Override 
	public Integer calculate(Integer first, Integer second) {
		return first + second;
	}
}