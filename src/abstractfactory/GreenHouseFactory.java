package abstractfactory;

public class GreenHouseFactory implements FruitFactory{

	@Override
	public Fruit getApple() {
		return new GreenHouseApple();
	}

	@Override
	public Fruit getBanana() {
		return new GreenHouseBanana();
	}

}
