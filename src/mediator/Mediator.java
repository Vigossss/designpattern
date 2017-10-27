package mediator;

public class Mediator {
	private Man man;
	private Woman woman;
	
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	
	public void part(Person p){
		if(p instanceof Man){
			this.setMan((Man)p);
		}else{
			this.setWoman((Woman)p);
		}
		
		if(man != null && woman != null){
			if(man.getCondition() == woman.getCondition()){
				System.out.println("配对成功：" + man.getName() + " + " + woman.getName());
			}else{
				System.out.println("没有配对成功：" + man.getName() + " + " + woman.getName());
			}
		}else{
			System.out.println("缺人");
		}
	}
}
