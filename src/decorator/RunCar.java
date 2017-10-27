package decorator;

public class RunCar implements Car{

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void show() {
		run();
	}

}
