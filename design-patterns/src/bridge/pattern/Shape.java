package bridge.pattern;

/**
 * Abstract Shape class. 
 * Uses the drawAPI to change how shapes are drawn based on 
 * concrete implementations of classes using drawAPI interface. 
 * 
 * Subclasses must also implement draw();
 * 
 * @author armin2
 *
 */
public abstract class Shape {
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI)
	{
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
