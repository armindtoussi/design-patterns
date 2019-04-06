package builder.pattern;

/**
 * Similar to burger this is an abstract class that implements the drink.
 * Packing for a drink is a bottle. 
 * 
 * @author armin2
 *
 */
public abstract class ColdDrink implements Item {

	@Override 
	public Packing packing() {
		return new Bottle();
	}
	
	@Override 
	public abstract float price();
}
