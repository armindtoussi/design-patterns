package prototype.pattern;

/**
 * Prototype pattern demo. 
 * 
 * First we load the cache, which is a mock database call to populate
 * a hashtable with objects.
 * 
 * Then we create a shape object, but we use the ShapeCache's static method
 * in order to clone each object from the hashtable stored in the ShapeCache. 
 * 
 * 
 * @author armin2
 *
 */
public class PrototypePatternDemo {
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape: " + clonedShape3.getType());
	}
}
