package bridge.pattern;

/**
 * Concrete implementation of the DrawAPI. 
 * This class uses drawapi to draw red circles. 
 * 
 * 
 * @author armin2
 *
 */
public class RedCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) 
	{
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}
}
