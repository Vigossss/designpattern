package builder;

public class BuilderB implements HouseBuilder{
	private House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("floor B");
	}

	@Override
	public void makeWall() {
		house.setWall("wall B");
	}

	@Override
	public void makeTop() {
		house.setTop("top B");
	}


	@Override
	public House build() {
		return house;
	}

}
