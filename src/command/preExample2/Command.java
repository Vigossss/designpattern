package command.preExample2;

public abstract class Command {
	private Peddler ped;
	
	public Command(Peddler ped){
		this.ped = ped;
	}
	
	public abstract void sell();

	public Peddler getPed() {
		return ped;
	}

	public void setPed(Peddler ped) {
		this.ped = ped;
	}
}
