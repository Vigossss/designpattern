package abstractfactory;

/**
 * 抽象工厂模式
 * 向客户端提供接口，使得客户端在不必指定产品具体类型情况下，
 * 创建多个产品族对应的产品对象
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 每个工厂都生产所有的产品（一个类型的），即产品族，
	 * 北方的生产北方的，南方的生产南方的
	 * 如果想要增加温室的，则新增一个温室的生产工厂即可
	 * 角色：Creator、Concrete Creator、Product、Concrete Product
	 * 工厂定义产品声明,工厂实现产生具体产品,产品,具体产品
	 * 
	 * 缺陷：如果新增一个产品，则全产品线都需要更改
	 * @param args
	 */
	public static void main(String[] args) {
		FruitFactory factory = new NorthFruitFactory();
		
		Fruit apple = factory.getApple();
		apple.get();
		Fruit banana = factory.getBanana();
		banana.get();
		
		factory = new SouthFruitFactory();
		
		apple = factory.getApple();
		apple.get();
		banana = factory.getBanana();
		banana.get();
		
		/*增加温室供应*/
		factory = new GreenHouseFactory();
		apple = factory.getApple();
		apple.get();
		banana = factory.getBanana();
		banana.get();
	}
}
