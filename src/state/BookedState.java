package state;

/**
 * 空闲类
 * @author 311396
 *
 */
public class BookedState implements State{
	
	private Room room;
	
	public BookedState(Room room) {
		this.room = room;
	}

	@Override
	public void bookRoom() {
		System.out.println("该房间已经被预订了");
	}

	@Override
	public void unsubcribeRoom() {
		System.out.println("退订成功!");
		room.setState(room.getFree());
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
