package decoratorFacade;

public class Classical_burger implements Burger {

	@Override
	public String getDescription() {

		return "Classic burger";
	}

	@Override
	public double getPrice() {
		
		return 2.50;
	}

	

}