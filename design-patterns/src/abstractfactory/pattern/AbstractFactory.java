package abstractfactory.pattern;

/**
 * Abstract factory is the parent class of a concrete implementation of a 
 * factory. We have determined that we, at the very least, need a getShape 
 * method. This forces the extendee to implement this method. 
 * By implementing this method, we are able to create any shape that is 
 * provided as a String(enum) to the method. 
 * 
 * @author armin2
 *
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}
