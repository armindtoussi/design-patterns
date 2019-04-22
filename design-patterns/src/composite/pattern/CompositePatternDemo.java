package composite.pattern;

/**
 * The demo class for this pattern.
 * We can see that we are creating a hierarchy using this Composite Employee class. 
 * 
 * Setting the CEO as the top of the hierarchy, with their direct subordinates 
 * below them. Then we use those subordinates objects to add their direct subordinates. 
 * 
 * This pattern seems like a flimsy inheritance hierarchy.
 * 
 * @author armin2
 *
 */
public class CompositePatternDemo {

	public static void main(String[] args)
	{
		Employee CEO = new Employee("John", "CEO", 30000);
		
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		
		Employee headMarketing = new Employee("Micheal", "Head Marketing", 20000);
		
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(CEO);
		
		for(Employee headEmployee : CEO.getSubordinates())
		{
			System.out.println(headEmployee);
			
			for(Employee employee: headEmployee.getSubordinates())
			{
				System.out.println(employee);
			}
		}
	}
}
