package builder.pattern;

/**
 * Concrete implementation of Packing interface. 
 * This is for food packaging. 
 * 
 * @author armin2
 *
 */
public class Wrapper implements Packing {
	@Override
	public String pack() {
		return "Wrapper";
	}
}
