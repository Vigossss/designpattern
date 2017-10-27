package decorator;

public abstract class CarDecorator {
	private Car car;
	
	public CarDecorator(Car car){
		this.car = car;
	}
	
	public Car getCar(){
		return this.car;
	}
	
	public abstract void show();
}
