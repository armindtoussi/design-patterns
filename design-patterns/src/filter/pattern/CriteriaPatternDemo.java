package filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a structural pattern. I honestly don't fully understand this pattern
 * I will have to do some more reading and testing so that I fully understand this. 
 * 
 * Nevermind i get it. you're creating an interface that defines the critera methods.
 * Then we're implementing concrete classes that define various filter types. So in our case
 * we're using single, male, female. 
 * Then we're also creating concrete implementations of Criteria interface to define 
 * multiple filters using 'and & 'or'. These and/or criteria classes allow us to 
 * filter by 2 diferent critera. 
 * 
 * This pattern allows us to heavily decouple. 
 * 
 * @author armin2
 *
 */
public class CriteriaPatternDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John", "Male", "Married"));
	      persons.add(new Person("Laura", "Female", "Married"));
	      persons.add(new Person("Diana", "Female", "Single"));
	      persons.add(new Person("Mike", "Male", "Single"));
	      persons.add(new Person("Bobby", "Male", "Single"));

	      Criteria male = new CriteriaMale();
	      Criteria female = new CriteriaFemale();
	      Criteria single = new CriteriaSingle();
	      Criteria singleMale = new AndCriteria(single, male);
	      Criteria singleOrFemale = new OrCriteria(single, female);
	      
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));

	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));

	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCriteria(persons));

	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	}
	
	public static void printPersons(List<Person> persons)
	{ 
      for (Person person : persons) {
         System.out.println("Person : [ Name : " + person.getName() 
         				+ ", Gender : " + person.getGender() 
         				+ ", Marital Status : " + person.getMaritalStatus() 
         				+ " ]");
      }
   }  
}
