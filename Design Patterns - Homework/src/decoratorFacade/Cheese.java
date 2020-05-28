package decoratorFacade;

public class Cheese extends BurgerDecorator {

	public Cheese(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	
	public String getDescription(){
		return burger.getDescription() + " - extra cheese";
	}
	
	public double getPrice(){
		return burger.getPrice() + 1.80;
	}
	

}
