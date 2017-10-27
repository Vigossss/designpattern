package strategy;

public class Context {
	private Strategy stgy;

	public Context(Strategy stgy) {
		this.stgy = stgy;
	}
	
	public void encrypt(){
		stgy.encrypt();
	}
}
