package command;

public class PearCommand extends Command {

	@Override
	public void sell() {
		this.getPed().sellPear();
	}

}
