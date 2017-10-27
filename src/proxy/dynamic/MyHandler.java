package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	private Subject subject;
	public MyHandler(Subject subject){
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		discount();
		method.invoke(subject, args);
		giveCash();
		return null;
	}
	
	private void discount(){
		System.out.println("打折");
	}
	
	private void giveCash(){
		System.out.println("赠与代金券");
	}

}
