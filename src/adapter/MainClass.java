package adapter;

/**
 * 适配器模式
 * 构造性模式
 * 改变已有类（或外部类）的接口形式
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 需要实现某些功能，这些功能已有还不成熟的一个或多个外部组件
	 * 重新开发这些组件功能耗费太大，但是外部组件更换时需要修改引用代码，也可能引发问题
	 * 做一个适配接口，透明调用外部组件，当出现变动时仅需要修改适配接口的实现
	 * 
	 * 委派实现
	 * @param args
	 */
	public static void main(String[] args) {
		CurrentPower cp = new CurrentPower();
		cp.use220();
		
		System.out.println();
		
		Adapter ad = new Adapter(cp);
		ad.use15();
	}
}
