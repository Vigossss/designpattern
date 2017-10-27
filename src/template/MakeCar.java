package template;

/**
 * 组装车
 * @author 311396
 *
 */
public abstract class MakeCar {
	abstract void makeHead();
	abstract void makeBody();
	abstract void makeWheel();
	
	void make(){
		this.makeBody();
		this.makeHead();
		this.makeWheel();
	}
}
