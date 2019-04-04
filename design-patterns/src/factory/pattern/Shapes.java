package factory.pattern;

public enum Shapes {
	CIRCLE("CIRCLE"),
	RECTANGLE("RECTANGLE"),
	SQUARE("SQUARE");
	
	private final String shape;
	
	Shapes(final String shape) 
	{
		this.shape = shape;
	}
	
	@Override
	public String toString()
	{
		return shape;
	}
}
