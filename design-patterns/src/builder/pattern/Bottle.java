package builder.pattern;

/**
 * Another concrete implementation of Packing, 
 * this one is for drinks 
 * @author armin2
 *
 */
public class Bottle implements Packing {
	
	@Override
	public String pack() {
		return "Bottle";
	}
}
