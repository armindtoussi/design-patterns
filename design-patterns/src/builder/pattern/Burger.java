package builder.pattern;

/**
 * Abstract burger class 
 * implements Item, which has some methods that need implementing, but since 
 * this is an abstract class those are not 100% required to be implemented here but 
 * must be implemented in any concrete extended classes. 
 * 
 * Also of note is the packing() method returning a Wrapper; A wrapper 
 * is the designated packing of any food item so it makes sense to do this. 
 * 
 * @author armin2
 *
 */
public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
