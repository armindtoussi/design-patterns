package composite.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern is a structural design pattern. 
 * This employee class acts as a composite pattern actor class. 
 * THe idea is that you can store direct children in an instance of this 
 * object. 
 * It creates a sort of psuedo inheritance hierarchy. maybe just a hierarchy without 
 * actual inheritance. 
 * 
 * @author armin2
 *
 */
public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int sal) 
	{
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e) 
	{
		subordinates.add(e);
	}
	
	public void remove(Employee e)
	{
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates() 
	{
		return subordinates;
	}
	
	public String toString() 
	{
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
	}
}
