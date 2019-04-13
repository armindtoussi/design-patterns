package bridge.pattern;

/**
 * Concrete implementation of Shape interface. 
 * Ctor passes drawAPI to parent for instantiation. 
 * 
 * draw() method is implemented. 
 * 
 * So at this point there is no concrete relation between redcircle/greencircles.
 * The only relation is between parent class Shape, and DrawAPI which are both abstracts. 
 * The demo will show how bridging happens.
 * 
 * @author armin2
 *
 */
public class Circle extends Shape {
	
	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) 
	{
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void draw() 
	{
		drawAPI.drawCircle(radius,  x , y);
	}
}
