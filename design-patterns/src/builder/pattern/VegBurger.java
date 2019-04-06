package builder.pattern;

/**
 * Concrete implementation of the Burger class. 
 * This class implements the methods that were not implemented in it's 
 * parents class as it's required to.  packing() method does not has to 
 * be implemented as an implementation of this method is provided in the parent 
 * class, and since all burgers get a wrapper as packing, this makes sense. 
 * @author armin2
 *
 */
public class VegBurger extends Burger {
	
	@Override 
	public float price() {
		return 25.0f; 
	}
	
	@Override 
	public String name() {
		return "Veg Burger";
	}
}
