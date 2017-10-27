package bridge;

public class Bus extends Car{

	public Bus(Engine engine) {
		super(engine);
	}

	@Override
	public void installEngine() {
		System.out.println("安装Bus发动机");
		this.getEngine().installEngine();
	}

}
