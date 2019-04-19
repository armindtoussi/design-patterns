package filter.pattern;

import java.util.List;

/**
 * oohh and criteria defines a combination of criteria. 
 * ie. if a person is male and single. or female and not single.
 * 
 * @author armin2
 *
 */
public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria)
	{
		this.criteria      = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	/**
	 * This function is taking the criteria and populating a list based on that criteria. 
	 * Then checking the other criteria against that list. 
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
