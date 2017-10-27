package strategy.example;

public class StrategyA implements Strategy{

	@Override
	public Double cost(Double fee) {
		return fee * 0.8;
	}
	
}
