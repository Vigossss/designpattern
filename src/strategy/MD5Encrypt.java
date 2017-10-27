package strategy;

public class MD5Encrypt implements Strategy{

	@Override
	public void encrypt() {
		System.out.println("执行MD5加密");
	}
	
}
