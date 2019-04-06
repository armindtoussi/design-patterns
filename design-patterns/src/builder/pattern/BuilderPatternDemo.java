package builder.pattern;

/**
 * This is the demo jump off point, 
 * We create different meals using the meal builder. 
 * Builder PAttern is a simple way to create complex objects. 
 * It's a Creational Pattern. 
 * 
 * @author armin2
 *
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.PrepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVeg = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVeg.showItems();
		System.out.println("Total Cost: " + nonVeg.getCost());
	}
}
