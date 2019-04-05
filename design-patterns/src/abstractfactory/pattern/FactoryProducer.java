package abstractfactory.pattern;

/**
 * Factory producer allows the programmer to select what type of factory that 
 * they want to use. 
 * In this case we use a boolean to determine what type of factory we want and thus, 
 * what type of shapes that we want (rounded, shape edged).
 * 
 * @author armin2
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) 
			return new RoundedShapeFactory();
		return new ShapeFactory();
	}
}
