package flyweight;

public class Teacher extends Person{
	private String no;
	
	public Teacher(String name, Integer age, String sex) {
		super(name, age, sex);
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public Teacher(){
		super();
	}
}
