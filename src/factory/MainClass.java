package factory;

/**
 * 工厂方法模式
 * 类的创建模式
 * 定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中，
 * 和新工厂类不再负责产品的创建。
 * 优点是使得工厂方法模式可以让系统在不修改具体工厂角色的请况下引进新的产品
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * role:Creator、 Concrete Creator、 Product、 Concrete Product
	 * 为每一个产品实现自己的工厂实现
	 * @param args
	 */
	public static void main(String[] args) {
		FruitFactory factory = new AppleFactory();
		factory.getFruit().get();
		
		factory = new BananaFactory();
		factory.getFruit().get();
	}
}
