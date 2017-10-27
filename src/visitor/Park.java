package visitor;

/**
 * 公园分为2个部分
 * 定义公园整体、A/B部分的接受行为
 * @author 311396
 *
 */
public class Park implements ParkElement{
	private ParkA parkA;
	private ParkB parkB;
	
	public Park(ParkA parkA, ParkB parkB) {
		this.parkA = parkA;
		this.parkB = parkB;
	}



	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		parkA.accept(visitor);
		parkB.accept(visitor);
	}
}
