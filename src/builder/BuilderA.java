package builder;

public class BuilderA implements HouseBuilder{
	private House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("floor A");
	}

	@Override
	public void makeWall() {
		house.setWall("wall A");
	}

	@Override
	public void makeTop() {
		house.setTop("top A");
	}


	@Override
	public House build() {
		return house;
	}

}
