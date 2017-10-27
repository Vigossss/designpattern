package visitor;


public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {
		
	}

	@Override
	public void visit(ParkA parka) {
		System.out.println("清洁工A complete");
	}

	@Override
	public void visit(ParkB parkb) {
		
	}


}
