package simplefactory;

public class FruitFactory implements Factory{

	@Override
	public Fruit getFruit(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*if("apple".equals(type)){
			return new Apple();
		}else if("banana".equals(type)){
			return new Banana();
		}
		return null;*/
		return (Fruit)Class.forName(type).newInstance();
	}

	@Override
	public Fruit getApple() {
		return new Apple();
	}

	@Override
	public Fruit getBanana() {
		return new Banana();
	}
	
}
