package abstractfactory.pattern;

import factory.pattern.Shapes;

/**
 * Demo jump off point. 
 * 
 * Here we are testing the abilities of the AbstractFactory Pattern. 
 * We use the abstract factory, and it's concrete child implementations, 
 * to fetch shapes of a certain type, either rounded or not. 
 * 
 * We then call the shapes draw method to ensure the correct objects are 
 * created and used.
 *
 * This pattern is a Creational Pattern. 
 * 
 * @author armin2
 *
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory.getShape(Shapes.SQUARE.toString());
		Shape shape2 = shapeFactory.getShape(Shapes.RECTANGLE.toString());
		
		shape1.draw();
		shape2.draw();
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory1.getShape(Shapes.RECTANGLE.toString());
		Shape shape4 = shapeFactory1.getShape(Shapes.SQUARE.toString());
		
		shape3.draw();
		shape4.draw();
	}
}
