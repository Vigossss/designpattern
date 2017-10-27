package simplefactory;

public interface Factory {
	Fruit getFruit(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
	
	Fruit getApple();
	
	Fruit getBanana();
}
