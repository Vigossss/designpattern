package visitor;

/**
 * 访问者模式
 * 行为模式
 * 分离对象的数据和行为，在不修改已有类的情况下，增加新的操作
 * 软件的开闭原则：对修改关闭，对扩展开放
 * 
 * @author 311396
 *
 */
public class MainClass {
	
	/**
	 * 角色：Object structure(对象结构角色，能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素)、
	 * Element(元素,提供accept行为）、Conrete Element(具体元素)、
	 * Visitor(访问者接口,提供visit行为)、Conrete Visitor(访问者接口实现)。
	 * 
	 * 例子：公园有两个块区域，分为两个清洁工管理，此外还有一个公园管理者
	 * 访问者：清洁工A/B、公园管理
	 * 
	 * 公园接口定义了接收行为
	 * 公园分为A/B两个元素，分别定义了接收实现
	 * 公园的实现定义了接收实现，先整体行为，接着A和B的行为。
	 * 
	 * 访问者接口定义了所有访问的行为
	 * 每个访问者实现了自己的一部分访问
	 * 
	 * 访问者访问时，公园执行接收行为
	 * 以A访问者为例，此例中表现为先查看对整体的元素的访问，没有；然后查看A元素的接收，有；B元素的接收没有
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Park park = new Park(new ParkA(), new ParkB());
		
		VisitorA va = new VisitorA();
		park.accept(va);
		
		VisitorB vb = new VisitorB();
		park.accept(vb);
		
		VisitorManager vm = new VisitorManager();
		park.accept(vm);
	}
}
