package builder.pattern;

/**
 * Same idea here as the veg burger class. 
 * 
 * @author armin2
 *
 */
public class ChickenBurger extends Burger {
	
	@Override 
	public float price() {
		return 50.0f;
	}
	
	@Override public String name() {
		return "Chicken Burger";
	}
}
