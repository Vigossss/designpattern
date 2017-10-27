package testfactory;

public class OperationFactory {
	public static Operation opration(String op){
		if("+".equals(op)){
			return new AddOperation();
		}
		return null;
	}
}
