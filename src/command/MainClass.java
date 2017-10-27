package command;

/**
 * 命令模式
 * 行为设计模式
 * 通过被称为Command的类封装了对目标对象的调用行为以及调用参数
 * 
 * 适用于：调用过程复杂，存在多处调用。
 * 使用Command类封装，便于使用
 * 前后对调用参数处理以及日志、缓存、历史记录等
 * 
 * @author 311396
 *
 */
public class MainClass {
	
	/**
	 * 命令类定义了操作行为
	 * 不同的实现类实现不同的操作
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Peddler ped = new Peddler();
		Command cmd = new AppleCommand();
		cmd.setPed(ped);
//		cmd.sell();
		Waiter wat = new Waiter();
		wat.setCmd(cmd);
		wat.sell();
		
		cmd = new PearCommand();
		cmd.setPed(ped);
//		cmd.sell();
		wat.setCmd(cmd);
		wat.sell();
	}
}
