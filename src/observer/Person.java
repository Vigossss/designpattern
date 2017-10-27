package observer;

import java.util.Observable;

public class Person extends Observable{
	private String name;
	private Integer age;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//标志为改变
		this.setChanged();
		this.notifyObservers(name);
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
