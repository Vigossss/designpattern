package observer;

import java.util.Observable;
import java.util.Observer;

public class MyObServerA implements Observer{
	/**
	 * 被观察者指定的状态发生变化时回调此方法
	 */
	@Override
	public void update(Observable paramObservable, Object paramObject) {
		System.out.println("改名字了    A");
		System.out.println(paramObject);
	}

}
