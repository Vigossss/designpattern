package strategy.example;

public class MainClass {
	public static void main(String[] args) {
		Double fee = 300D;
		Context ctx = new Context(new StrategyA());
		Double cost = ctx.cost(fee);
		System.out.println(cost);
		
		ctx = new Context(new StrategyB());
		cost = ctx.cost(fee);
		System.out.println(cost);
	}
}
