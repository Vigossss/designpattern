package proxy;

public class ProxySubject implements Subject{
	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void sellBook() {
		discount();
		subject.sellBook();
		giveCash();
	}
	
	private void discount(){
		System.out.println("打折");
	}
	
	private void giveCash(){
		System.out.println("赠与代金券");
	}
}
