package template;


public class MakeBus extends MakeCar {

	@Override
	void makeHead() {
		System.out.println("bus 组装 头");
	}

	@Override
	void makeBody() {
		System.out.println("bus 组装 身体");
	}

	@Override
	void makeWheel() {
		System.out.println("bus 组装 轮子");
	}

}
