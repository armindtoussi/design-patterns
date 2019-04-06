package builder.pattern;

/**
 * This class is the actual meal builder class. 
 * It will be responsible for creating meals for us. 
 * We have defined 2 meal types, veg and non-veg. 
 * This is just one way of implementing a builder. 
 * There are ways to implement so we have variable length creation. 
 * I.e. if a use selects item x,y,z, but not w. 
 * 
 * 
 * @author armin2
 *
 */
public class MealBuilder {
	
	public Meal PrepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal; 
	}
}
