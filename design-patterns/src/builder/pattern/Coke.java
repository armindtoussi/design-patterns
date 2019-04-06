package builder.pattern;

/**
 * Same idea as other concrete implementations, vegburger and chickenburger. 
 * This is drink tho so the implementation of packing is returning Bottle. 
 * 
 * @author armin2
 *
 */
public class Coke extends ColdDrink {
	
	@Override 
	public float price() {
		return 30.0f; 
	}
	
	@Override 
	public String name() {
		return "Coke";
	}
}
