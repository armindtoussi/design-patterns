package bridge.pattern;

/**
 * Concrete implementation of the DrawAPI. 
 * This class uses drawapi to draw green circles. 
 * 
 * 
 * @author armin2
 *
 */
public class GreenCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) 
	{
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}
}
