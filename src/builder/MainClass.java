package builder;

/**
 * 建造者模式
 * 对象创建型模式
 * 隐藏符合对象的创建过程，
 * 抽象创建过程，通过子类继承和重载的方式，动态创建具有复合属性的对象
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 与工厂模式区别是多了一个指挥角色HouseDirector
	 * 工厂是用来生产产品，建造者返回一个整体
	 * 负责指挥建造
	 * @param args
	 */
	public static void main(String[] args) {
		HouseBuilder builder = new BuilderA();
		
		/*builder.makeFloor();
		builder.makeWall();
		builder.makeTop();
		
		builder.build().display();*/

		HouseDirector dire = new HouseDirector();
		dire.build(builder);
		
		builder.build().display();
		
		builder = new BuilderB();
		dire = new HouseDirector();
		dire.build(builder);
		
		builder.build().display();
	}
}
