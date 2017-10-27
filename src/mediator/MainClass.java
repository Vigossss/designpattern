package mediator;

/**
 * 中介模式
 * 行为模式
 * 
 * 类之间的交互行为被统一放在Mediator对象中
 * M对象起着控制器作用
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 中介需要持有各方信息
	 * 各方也持有中介引用
	 * 调用中介提供方法，中介处理具体操作
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Person man = new Man("zhangsan", 5);
		man.setMediator(mediator);
		
		Person man2 = new Man("lisi", 5);
		man2.setMediator(mediator);
		
		Person woman = new Woman("xiaofang", 6);
		woman.setMediator(mediator);
		
		man.getPartner();
		man2.getPartner();
		woman.getPartner();
	}
}
