package builder;

public interface HouseBuilder {
	void makeFloor();
	void makeWall();
	void makeTop();
	House build();
}
