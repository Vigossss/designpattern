package command;

public abstract class Command {
	private Peddler ped;
	
	public abstract void sell();

	public void setPed(Peddler ped) {
		this.ped = ped;
	}

	public Peddler getPed() {
		return ped;
	}
	
}
