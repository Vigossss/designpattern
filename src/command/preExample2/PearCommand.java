package command.preExample2;

public class PearCommand extends Command {

	public PearCommand(Peddler ped) {
		super(ped);
	}

	@Override
	public void sell() {
		this.getPed().sellPear();
	}

}
