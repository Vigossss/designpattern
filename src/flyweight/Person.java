package flyweight;

public class Person {
	private String name;
	private Integer age;
	private String sex;
	
	public Person(String name, Integer age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Person(){};
}
