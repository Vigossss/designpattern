package proxy;

/**
 * 代理模式
 * 构造型设计模式
 * 可以为其他对象提供一种代理（Proxy）以控制对这个对象的访问
 * 
 * 代理：是指具有对代理元有相同的接口的类，客户端必须通过代理与被代理对象交互，
 * 代理则在前后选择进行自己的处理
 * @author 311396
 *
 */
public class MainClass {
	
	/**
	 * 角色：subject（抽象主题角色）、realSubject（真实主题角色）
	 * 、proxy（代理主题角色）。
	 * 
	 * subject	提供接口，定义行为
	 * realSubject	提供核心实现
	 * proxy	实现前后的一些行为
	 */
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		subject.sellBook();
		
		System.out.println();
		
		subject = new ProxySubject(subject);
		subject.sellBook();
	}
}
