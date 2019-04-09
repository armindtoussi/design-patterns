package prototype.pattern;

import java.util.Hashtable;

/**
 * The ShapeCache is a class that would fetch from the database, 
 * the data we need, and offer cloning capabilities from the hashtable/map 
 * we store the data in. 
 * The getShape() method is responsible here for cloning the original object(that we 
 * populated using a mock db call). 
 * One trick to cloning this way, is the calling function will need to cast the 
 * object to the required type. 
 * @author armin2
 *
 */
public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	/**
	 * This is mock object creation. 
	 * Typically you would have a database query fetch the data you need and put it 
	 * into a map. Instead we are mocking that functionality with object creation. 
	 */
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
