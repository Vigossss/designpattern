package observer;

import java.util.Observable;
import java.util.Observer;

public class MyObServerB implements Observer{
	/**
	 * 被观察者指定的状态发生变化时回调此方法
	 */
	@Override
	public void update(Observable paramObservable, Object paramObject) {
		System.out.println("改名字了   B");
		System.out.println(paramObject);
	}

}
