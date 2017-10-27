package mediator;

public class Man extends Person{
	public Man(String name, Integer condition) {
		super(name, condition);
	}

	@Override
	void getPartner() {
		this.getMediator().setMan(this);
		this.getMediator().part(this);
	}
	
}
