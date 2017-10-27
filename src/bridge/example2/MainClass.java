package bridge.example2;

/**
 * 桥接模式
 * 构造型设计模式
 * 基于类的最小设计原则，通过使用封装、聚合及继承等行为来让不同的类承担不同的责任
 * 主要特点是把抽象与行为实现分离开来，各部分有自己的独立性和功能扩展
 * 
 * @author 311396
 *
 */
public class MainClass {
	public static void main(String[] args) {
		
		Car car = new Bus();
		car.installEngine1000();
	}
}
