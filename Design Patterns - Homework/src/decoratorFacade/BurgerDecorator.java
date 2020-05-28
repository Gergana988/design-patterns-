package decoratorFacade;

public class BurgerDecorator implements Burger {

	protected Burger burger;

	public BurgerDecorator(Burger burgerWithExtra) {
		this.burger = burgerWithExtra;
	}

	@Override
	public String getDescription() {
		return this.burger.getDescription();
	}

	@Override
	public double getPrice() {
		return this.burger.getPrice();
	}

}
