package decorator;

public class FlyCarDecorator extends CarDecorator{

	public FlyCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void show() {
		this.getCar().show();
		fly();
	}
	public void fly(){
		System.out.println("fly");
	}

}
