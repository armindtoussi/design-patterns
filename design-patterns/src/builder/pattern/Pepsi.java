package builder.pattern;

/**
 * Same idea here as Coke. 
 * @author armin2
 *
 */
public class Pepsi extends ColdDrink {
	
	@Override
	public float price() {
		return 35.0f; 
	}
	
	@Override 
	public String name() {
		return "Pepsi";
	}
}
