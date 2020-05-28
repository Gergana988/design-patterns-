package decoratorFacade;

public class Egg extends BurgerDecorator{

	public Egg(Burger decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	
	public String getDescription(){
		return burger.getDescription() + " extra - egg";
	}
	
	public double getPrice(){
		return burger.getPrice() + 1.20;
	}
	

}