package command;

public class AppleCommand extends Command {

	@Override
	public void sell() {
		this.getPed().sellApple();
	}

}
