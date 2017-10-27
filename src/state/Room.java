package state;

public class Room {
	private State free;
	private State booked;
	private State checkIn;
	
	private State state;
	
	public Room(){
		free = new FreeTimeState(this);
		booked = new BookedState(this);
		checkIn = new CheckInState(this);
		state = free;
	}
	
	public void bookRoom() {
		state.bookRoom();
	}

	public void unsubcribeRoom() {
		state.unsubcribeRoom();
	}

	public void checkInRoom() {
		state.checkInRoom();
	}

	public void checkOutRoom() {
		state.checkOutRoom();;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getFree() {
		return free;
	}

	public State getBooked() {
		return booked;
	}

	public State getCheckIn() {
		return checkIn;
	}
	
}
