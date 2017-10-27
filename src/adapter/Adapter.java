package adapter;

/**
 * 委派
 * @author 311396
 *
 */
public class Adapter{
	private CurrentPower cp;
	
	public Adapter(CurrentPower cp){
		this.cp = cp;
	}
	
	public void use15(){
		System.out.println("使用适配器");
		cp.use220();
		System.out.println("转接输出15V");
	}
}
