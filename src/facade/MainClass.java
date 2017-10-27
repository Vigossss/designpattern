package facade;

/**
 * 外观模式
 * [fəˈsɑːd]
 * 为一组具有类似功能的类群
 * 如类库、子系统等等，提供一个一致的简单界面
 * 
 * @author 311396
 *
 */
public class MainClass {
	public static void main(String[] args) {
		System.out.println("I'm facade style");
		
		/*SysAll sys = new SystemA();
		sys.doSth();
		sys = new SystemB();
		sys.doSth();*/
		
		Facade f = new Facade();
		f.doSthA();
		System.out.println();
		f.doSth();
	}
}
