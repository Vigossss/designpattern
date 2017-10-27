package observer;

import java.util.Observer;

/**
 * 观察者模式
 * 行为模式
 * 当一个对象的状态发生变化时，能够自动通知其他关联对象，
 * 自动刷新对象状态
 * 
 * 提供给关联对象一种同步通信手段，对某个对象与依赖它的其他对象之间保持状态同步
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 被观察者继承Observable
	 * 改变的地方要标识改变并通知:
	 * this.setChanged();
	 * this.notifyObservers();
	 * 
	 * 观察者实现Observer接口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//创建观察者
		Observer oba = new MyObServerA();
		Observer obb = new MyObServerB();
		//创建被观察者
		Person p = new Person();
		//注册观察者
		p.addObserver(oba);
		p.addObserver(obb);
		System.out.println("观察者数量：" + p.countObservers());
		//做出改变
		p.setName("zhangsan");
		
		//清除所有观察者
		p.deleteObservers();
		System.out.println("观察者数量：" + p.countObservers());
		p.setName("lisi");
		
	}
}
