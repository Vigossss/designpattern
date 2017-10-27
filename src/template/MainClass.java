package template;

/**
 * 模板方法模式
 * 行为模式
 * 把具有特定步骤算法中的某些必要的处理委托给抽象方法，
 * 通过子类继承对抽象方法的不同实现改变整个算法的行为
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 具有统一的操作步骤
	 * 不同的操作细节
	 * @param args
	 */
	public static void main(String[] args) {
		MakeCar mc = new MakeBus();
	/*	mc.makeBody();
		mc.makeHead();
		mc.makeWheel();*/
		mc.make();
	}
}
