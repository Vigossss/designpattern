package mediator;

public abstract class Person {
	private String name;
	private Integer condition;
	private Mediator mediator;
	
	public Person(String name, Integer condition) {
		this.name = name;
		this.condition = condition;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCondition() {
		return condition;
	}

	public void setCondition(Integer condition) {
		this.condition = condition;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	abstract void getPartner();
}
