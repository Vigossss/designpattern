package singleton;


/**
 * 单例模式
 * 对象创建模式
 * 保证一个类，只有一个实例存在，同时提供能对该实例加以访问的全局访问方法
 * 
 * @author 311396
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Singleton ins1 = Singleton.getInstance();
		ins1.setName("zhangsan");
		ins1 = Singleton.getInstance();
		ins1.display();
	}
}
