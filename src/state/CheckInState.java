package state;

/**
 * 空闲类
 * @author 311396
 *
 */
public class CheckInState implements State{
	
	private Room room;
	
	public CheckInState(Room room) {
		this.room = room;
	}

	@Override
	public void bookRoom() {
		System.out.println("该房间已经被使用");
	}

	@Override
	public void unsubcribeRoom() {
	}

	@Override
	public void checkInRoom() {
		System.out.println("该房间已经被使用");
	}

	@Override
	public void checkOutRoom() {
		System.out.println("退房成功!");
		room.setState(room.getFree());
	}

}
