package filter.pattern;

import java.util.List;

/**
 * Criteria Interface. defines a method that takes and returns a 
 * list of Persons.
 * Implementations of this interface will allow us to 
 * define specific criteria to filter with using this method.
 * 
 * @author armin2
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
