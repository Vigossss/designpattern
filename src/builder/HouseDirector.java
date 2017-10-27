package builder;

public class HouseDirector {
	
	public void build(HouseBuilder builder){
		builder.makeFloor();
		builder.makeWall();
		builder.makeTop();
		builder.build();
	}
}
