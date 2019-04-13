package bridge.pattern;

/**
 * BridgePatternDemo: A structural pattern.
 * 
 * This pattern decouples abstraction from implementation as we've seen. 
 * This would allow us to change the behaviour of concrete implementations while 
 * maintaining decoupling. 
 * 
 * The way we bridge here is by passing in a DrawAPI into the Circle ctor. 
 * Red and Green circles are passed in as the draw api which seems to be 
 * how we bridge the gap and get our behaviour change with decoupling. 
 * 
 * @author armin2
 *
 */
public class BridgePatternDemo {
	public static void main(String[] args) 
	{
		Shape redCircle = new Circle(100, 100, 10, new RedCircle()); //RedCircle here is the DrawAPI being passed. 
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle()); //Same here. 
		
		redCircle.draw();
		greenCircle.draw();
	}
}
