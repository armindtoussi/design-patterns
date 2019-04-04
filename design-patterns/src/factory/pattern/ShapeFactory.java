package factory.pattern;

public class ShapeFactory 
{
	
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
			return null;
		
		if(shapeType.equalsIgnoreCase(Shapes.CIRCLE.toString())) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase(Shapes.RECTANGLE.toString())) {
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase(Shapes.SQUARE.toString())) {
			return new Square();
		}
		
		return null;
	}
}
