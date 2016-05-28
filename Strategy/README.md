For one problem we have different kinds of solutions. 

1. So we can create a interface to abstract these solutions and fetch the common solution function with `solve()`
```java
class interface Strategy {
	void solve(T paramFirst, T paramSecond);
}
```

2. Then, every solutions must implement this interface.
```java
class StrategyA implements Strategy {
	@Override
	public void solve(Integer first, Integer second) {
		// SolutionA content
	}
}
class StrategyB implements Strategy {
	@Override
	public void solve(Long first, Long second) {
		// SolutionB content
	}	
}
```

3. Create StrategyManager and Inject our Strategy object into StrategyManager.
```java
class StrategyManager {
	private Strategy strategy;
	void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}	
	public solve(T paramA, T paramB) {
		return strategy.solve(paramA, paramB);
	}
}
```

4. Let StrategyManager solve problem for us. All what we need to do for switching different strategy is to inject different Strategy Object into it.
```java
StrategyManager strategyManager = new StrategyManager();
strategyManager.setStrategy(new StrategyA());
strategyManager.solve(first, second);
strategyManager.setStrategy(new StrategyB());
strategyManager.solve(first, second);
```

![UML](https://github.com/simple-android-framework-exchange/android_design_patterns_analysis/blob/master/strategy/gkerison/images/strategy-kerison-uml.png)