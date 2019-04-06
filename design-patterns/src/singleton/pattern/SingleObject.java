package singleton.pattern;

/**
 * This is our singleton class. Singletons are a simlple 
 * Creational pattern. 
 * It is responsible for providing an object but only ONE instance 
 * of the object. This is useful when exactly one object is 
 * needed to coordinate actions across the system. 
 * 
 * We create our own object within the class, it's a field/member
 * this way  is best, if we created the object in the static method, then
 * multiple objects could end up floating around. 
 * 
 * We make the constructor private so this class can't be instantiated. 
 * 
 * We provide a static method that provides the instance we created 
 * to the outside world aka any service or class that requests it. 
 * 
 * @author armin2
 *
 */
public class SingleObject {
	//Create an object of the SingleObject. 
	private static SingleObject instance = new SingleObject();
	
	//Constructor is private so it cannot be instantiated 
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello Cruel World!");
	}
}
