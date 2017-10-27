package builder;

public class House {
	private String floor;
	
	private String wall;
	
	private String top;

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public void display() {
		System.out.println("House [floor=" + floor + ", wall=" + wall + ", top=" + top
				+ "]");
	}
	
}
