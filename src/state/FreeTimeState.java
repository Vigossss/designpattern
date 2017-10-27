package state;

/**
 * 空闲类
 * @author 311396
 *
 */
public class FreeTimeState implements State{
	
	private Room room;
	
	public FreeTimeState(Room room) {
		this.room = room;
	}

	@Override
	public void bookRoom() {
		System.out.println("预订成功!");
		room.setState(room.getBooked());
	}

	@Override
	public void unsubcribeRoom() {
		
	}

	@Override
	public void checkInRoom() {
		System.out.println("入住成功!");
		room.setState(room.getCheckIn());
	}

	@Override
	public void checkOutRoom() {
		
	}

}
