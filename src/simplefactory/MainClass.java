package simplefactory;

/**
 * 简单工厂模式
 * 类的创建模式
 *
 * @author 311396
 *
 */
public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Factory f = new FruitFactory();
		Fruit apple = f.getFruit("simplefactory.Apple");
		Fruit banana = f.getFruit("simplefactory.Banana");
		
		apple.get();
		banana.get();
		
		f.getApple().get();
		f.getBanana().get();
	}
}
