package chainOfResponsibility;

public class CarHeadHandler extends CarHandler{

	@Override
	public void handleCar() {
		System.out.println("组装车头");
		if(this.carHandler != null){
			this.carHandler.handleCar();
		}
	}

}
