package command.preExample2;

public class AppleCommand extends Command {

	public AppleCommand(Peddler ped) {
		super(ped);
	}

	@Override
	public void sell() {
		this.getPed().sellApple();
	}

}
