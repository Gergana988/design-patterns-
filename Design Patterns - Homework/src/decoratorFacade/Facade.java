package decoratorFacade;

public class Facade {
	
	private Burger classic;
	private Burger egg;
	private Burger cheese;
	
	public Facade(){
		
		this.classic = new Classical_burger();
		this.egg = new Egg(classic);
		this.cheese = new Cheese(classic);
	}
	
	
	public void getClassicBurger(){
		System.out.println("Burger: " + this.classic.getDescription());
		System.out.println("Price: " + this.classic.getPrice());
	}
	
	public void getClassicBurgerCheese(){
		System.out.println("Burger: " + this.cheese.getDescription());
		System.out.println("Price: " + this.cheese.getPrice());
	}
	
	public void getClassicBurgerEgg(){
		System.out.println("Burger: " + this.egg.getDescription());
		System.out.println("Price: " + this.egg.getPrice());
	}

}
