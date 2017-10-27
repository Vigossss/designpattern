package visitor;


public class VisitorB implements Visitor {

	@Override
	public void visit(Park park) {
		
	}

	@Override
	public void visit(ParkA parka) {
	}

	@Override
	public void visit(ParkB parkb) {
		System.out.println("清洁工B complete");
		
	}


}
