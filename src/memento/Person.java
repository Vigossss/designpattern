package memento;

public class Person {
	private String name;
	private String sex;
	private Integer age;
	
	public Person(){};
	
	public Person(String name, String sex, Integer age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public void display() {
		 System.out.println("Person [name=" + name + ", sex=" + sex + ", age=" + age + "]");
	}
	
	/**
	 * 创建一个备份
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(name, sex, age);
	}
	
	/**
	 * 通过备份恢复
	 * @param mto
	 */
	public void redo(Memento mto){
		this.name = mto.getName();
		this.age = mto.getAge();
		this.sex = mto.getSex();
	}
}
