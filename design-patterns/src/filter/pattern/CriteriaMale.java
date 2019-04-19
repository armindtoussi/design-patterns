package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines male filter criteria by implementing the Criteria interface.
 * 
 * @author armin2
 *
 */
public class CriteriaMale implements Criteria {
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) 
	{
		List<Person> malePersons = new ArrayList<Person>();
		
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
