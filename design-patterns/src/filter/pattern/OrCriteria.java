package filter.pattern;

import java.util.List;

/**
 * ohh.. or criteria defines 'or'. Meaning is this a female or single. 
 * Perhaps male or single. 
 * 
 * @author armin2
 *
 */
public class OrCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria)
	{
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for(Person person: otherCriteriaItems) 
		{
			if(!firstCriteriaItems.contains(person))
			{
				firstCriteriaItems.add(person);
			}
		}
		
		return firstCriteriaItems;
	}
}
