package strategy.example;

public class StrategyB implements Strategy{

	@Override
	public Double cost(Double fee) {
		if(fee > 200){
			return fee - 100;
		}
		return fee;
	}
	
}
