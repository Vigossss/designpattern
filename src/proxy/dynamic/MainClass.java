package proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * invocationHandle、invoke方法、Proxy.newInstance
	 * 代理类要实现InvocationHandler接口，重写invoke方法，加入自己的操作
	 * 通过Proxy.newProxyInstance执行
	 * 参数为被代理类的类加载器、接口列表、代理类的实例
	 */
	public static void main(String[] args) {
/*		Subject subject1 = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader()
				, RealSubject.class.getInterfaces()
				, new MyHandler(new RealSubject()));
		subject1.sellBook();*/
		
		Subject subject2 = (Subject)Proxy.newProxyInstance(Subject.class.getClassLoader()
				, new Class[]{Subject.class}
				, new MyHandler(new RealSubject()));
	
		subject2.sellBook();
	}
	
}
