package command;

public class Waiter {
	private Command cmd;

	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}
	
	public void  sell(){
		cmd.sell();
	}
}
