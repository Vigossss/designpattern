package testfactory;

public class AddOperation extends Operation{

	@Override
	public int getResult() {
		return this.getNum1() + this.getNum2();
	}

}
