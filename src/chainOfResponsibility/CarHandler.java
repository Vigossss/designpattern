package chainOfResponsibility;

public abstract class CarHandler {
	protected CarHandler carHandler;
	
	public void setNextHandler(CarHandler carHandler){
		this.carHandler = carHandler;
	}
	
	public abstract void handleCar();
}
