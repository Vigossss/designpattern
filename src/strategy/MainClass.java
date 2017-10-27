package strategy;

/**
 * 策略模式
 * 行为模式
 * 对一系列算法封装，为所有算法定义一个抽象的接口，
 * 并通过继承改抽象算法接口对所有的算法加以封装和实现，
 * 具体的算法选择交由客户端决定。
 * 主要用于算法的平滑切换
 * @author 311396
 *
 */
public class MainClass {
	
	/**
	 * 角色：Context、Strategy、ConcreteStrategy
	 * Strategy接口提供抽象方法、ConcreteStrategy策略具体实现
	 * 、Context策略的容器类，提供对统一方法
	 * @param args
	 */
	public static void main(String[] args) {
		//传统
	/*	Strategy stra = new MD5Encrypt();
		stra.encrypt();
		stra = new MDSEncrypt();
		stra.encrypt();*/
		
		//目前实现  体现封装思想
		Context ctx = new Context(new MD5Encrypt());
		ctx.encrypt();
	}
}
