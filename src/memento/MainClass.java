package memento;

/**
 * 备忘录模式
 * 行为模式
 * 保存对象的内部状态，
 * 并在需要的时候（undo/rollback）恢复对象之前的状态
 * @author 311396
 *
 */
public class MainClass {

	/**
	 * 备忘录模式
	 * 如同游戏里一样，由用户创建备忘录
	 * 并自己选择去读取备份
	 * 角色：Originator、Memeto、CareTaker
	 * 分别为原生、备忘、备忘管理作用
	 * 因为备忘录会很多，所以需要一个管理者存在
	 * @author 311396
	 *
	 */
	public static void main(String[] args) {
		
		Person per = new Person("zhangsan", "male", 11);
		/*传统实现 start*/
		/*Person back = new Person();
		
		back.setName(per.getName());
		back.setAge(per.getAge());
		back.setSex(per.getSex());
		per.display();
		
		per.setAge(30);
		per.display();
		
		per.setName(back.getName());
		per.setAge(back.getAge());
		per.setSex(back.getSex());
		per.display();*/
		/*传统实现 end*/
		
		CareTaker careTaker = new CareTaker();
//		Memento createMemento = per.createMemento();
		careTaker.setMto(per.createMemento());
		per.setAge(30);
		per.display();
		
//		per.redo(createMemento);
		per.redo(careTaker.getMto());
		per.display();
	}
}
