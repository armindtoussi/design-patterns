package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines single filter criteria by implementing the Criteria interface.
 * 
 * @author armin2
 *
 */
public class CriteriaSingle implements Criteria {
	
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> singlePersons = new ArrayList<Person>();
		
		for(Person person: persons)
		{
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) 
			{
				singlePersons.add(person);
			}
		}
		
		return singlePersons;
	}
}
