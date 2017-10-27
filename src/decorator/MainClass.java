package decorator;

/**
 * 装饰模式
 * 
 * 通过一种对客户端透明的方式来扩展对象的功能，是继承关系的一个替换方案
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 装饰模式是增加新功能，而代理模式主要是控制
	 * @param args
	 */
	public static void main(String[] args) {
		CarDecorator cd = new FlyCarDecorator(new RunCar());
		cd.show();
	}
}
