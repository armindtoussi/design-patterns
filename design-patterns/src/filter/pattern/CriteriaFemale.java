package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines female filter criteria by implementing the Criteria interface. 
 * 
 * @author armin2
 *
 */
public class CriteriaFemale  implements Criteria {
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) 
	{
		List<Person> femalePersons = new ArrayList<Person>();
		
		for(Person person: persons)
		{
			if(person.getGender().equalsIgnoreCase("FEMALE"))
			{
				femalePersons.add(person);
			}
		}
		
		return femalePersons;
	}
}
