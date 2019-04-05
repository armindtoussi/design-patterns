package abstractfactory.pattern;

import factory.pattern.Shapes;

/**
 * Rounded shape factory produces rounded objects for us. 
 * We do not need to create the objects ourselves, we just pass a string or 
 * some other data type(depending on how factory is built) to determine, 
 * and fetch the type of object we want.
 * @author armin2
 *
 */
public class RoundedShapeFactory extends AbstractFactory {
	
	@Override 
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase(Shapes.RECTANGLE.toString())) {
			return new RoundedRectangle();
		} else if(shapeType.equalsIgnoreCase(Shapes.SQUARE.toString())) {
			return new RoundedSquare();
		}
		return null;
	}
}
