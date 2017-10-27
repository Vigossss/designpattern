package bridge.example2;

public class Bus implements Car{

	@Override
	public void installEngine1000() {
		System.out.println("bus 1000 安装");
	}

	@Override
	public void installEngine2000() {
		System.out.println("bus 2000 安装");
	}

}
