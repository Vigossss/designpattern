package prototye;

import java.io.Serializable;
import java.util.List;

public class Person implements Cloneable, Serializable{
	private String name;
	private Integer age;
	private String sex;
	
	private List<String> friends;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public Person clone() throws CloneNotSupportedException{
		return (Person) super.clone();
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
