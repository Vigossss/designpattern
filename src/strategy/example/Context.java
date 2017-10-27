package strategy.example;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public Double cost(Double fee){
		return strategy.cost(fee);
	}
}
