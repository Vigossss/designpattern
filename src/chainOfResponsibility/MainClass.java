package chainOfResponsibility;

/**
 * 职责链模式[rɪˌspɑ:nsəˈbɪləti]
 * 行为模式
 * 
 * 构造一系列分别担当不同的职责的类的对象来共同完成一个任务
 * 这些类的对象之间像链条一样紧密相连
 * 
 * @author 311396
 *
 */
public class MainClass {
	public static void main(String[] args) {
		CarHandler head = new CarHeadHandler();
		CarHandler body = new CarBodyHandler();
		CarHandler tail = new CarTailHandler();
		head.setNextHandler(body);
		body.setNextHandler(tail);
		
		head.handleCar();
	}
}
