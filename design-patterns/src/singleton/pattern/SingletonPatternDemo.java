package singleton.pattern;

/**
 * This is the demo jump off point.
 * 
 * 
 * @author armin2
 *
 */
public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		
		//This is an error it's an illegal construct.
		// Cannot instantiate from a private constructor. 
		// SingleObject object = new SingleObject();
		
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
