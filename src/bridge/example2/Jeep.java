package bridge.example2;

public class Jeep implements Car{
	@Override
	public void installEngine1000() {
		System.out.println("jeep 1000 安装");
	}

	@Override
	public void installEngine2000() {
		System.out.println("jeep 2000 安装");
	}
}
