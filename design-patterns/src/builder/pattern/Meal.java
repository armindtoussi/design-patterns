package builder.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an entire meal with many items. 
 * We store the meal items, such as chicken burger, and coke, in  
 * an array list. We use this list to calculate cost and display items etc. 
 * 
 * @author armin2
 *
 */
public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.0f;
		
		for(Item item : items) {
			cost += item.price();
		}
		return cost; 
	}
	
	public void showItems() {
		for(Item item: items) {
			System.out.print("Item: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.println(", Price: " + item.price());
		}
	}
}
