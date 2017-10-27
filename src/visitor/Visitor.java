package visitor;

/**
 * 这里使用重载是区分不同的元素
 * 
 * @author 311396
 *
 */
public interface Visitor {
	void visit(Park park);
	void visit(ParkA parka);
	void visit(ParkB parkb);
}
