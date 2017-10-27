package singleton;

public class Singleton {
	private static volatile Singleton instance;
	
	private String name;
	
	private final static Singleton HUNGRY = new Singleton();
	
	private Singleton(){};
	
	public void setName(String name){
		this.name = name;
	}
	
	public void display(){
		System.out.println(this.name);
	}
	
	/**
	 * 双重校验，保证线程的安全性
	 * @return
	 */
	public static Singleton getInstance(){
		//关键字放在方法上会出现，可以判断为已经有对象存在的那些请求进来也被阻塞
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	/**
	 * 饿汉式
	 */
	public static Singleton getByHung(){
		return HUNGRY;
	}
	
	/**
	 * 懒汉式,线程不安全
	 */
	public static Singleton getByLazy(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
