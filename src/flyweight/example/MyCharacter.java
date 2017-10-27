package flyweight.example;

public class MyCharacter {
	private Character mychar;
	
	public MyCharacter(Character mychar){
		this.mychar = mychar;
	}
	
	public Character getChr(){
		return mychar;
	}
	
	public void display(){
		System.out.println(mychar);
	}
}
