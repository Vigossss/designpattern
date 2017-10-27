package mediator;

public class Woman extends Person{
	public Woman(String name, Integer condition) {
		super(name, condition);
	}
	@Override
	void getPartner() {
		this.getMediator().setWoman(this);
		this.getMediator().part(this);
	}	
}
