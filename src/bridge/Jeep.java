package bridge;

public class Jeep extends Car{

	public Jeep(Engine engine) {
		super(engine);
	}

	@Override
	public void installEngine() {
		System.out.println("安装Jeep发动机");
		this.getEngine().installEngine();
	}

}
