package facade;


public class Facade {
	private SystemA sysA;
	private SystemB sysB;
	
	public Facade(){
		this.sysA = new SystemA();
		this.sysB = new SystemB();
	}
	
	public void doSthA(){
		sysA.doSth();
	}
	
	public void doSth(){
		sysA.doSth();
		sysB.doSth();
	}
	
}
