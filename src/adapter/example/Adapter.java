package adapter.example;

/**
 * 继承 
 * @author 311396
 *
 */
public class Adapter extends CurrentPower{
	public void use15(){
		System.out.println("使用适配器");
		super.use220();
		System.out.println("转接输出15V");
	}
}
