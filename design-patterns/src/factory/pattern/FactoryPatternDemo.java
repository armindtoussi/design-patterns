package factory.pattern;

/**
 * Factory Pattern 
 * Type: Creation Design Pattern.
 * 
 * Allows us to create objects without exposing the creation logic to the client. 
 * Allows referring to a newly created object using a common interface. 
 * 
 * @author armin
 *
 */
public class FactoryPatternDemo {

	/**
	 * 2 examples of factory pattern here. Shapes and Animals.
	 * Using enums to keep consistent strings across classes. 
	 * 
	 * @param args none.
	 */
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape(Shapes.CIRCLE.toString());
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape(Shapes.RECTANGLE.toString());
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape(Shapes.SQUARE.toString());
		shape3.draw();
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal animal1 = animalFactory.getAnimal(Animals.LION.toString());
		animal1.draw();
		
		Animal animal2 = animalFactory.getAnimal(Animals.TIGER.toString());
		animal2.draw();
		
		Animal animal3 = animalFactory.getAnimal(Animals.GIRAFFE.toString());
		animal3.draw();
		
	}
}
