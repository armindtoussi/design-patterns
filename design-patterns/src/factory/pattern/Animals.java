package factory.pattern;

public enum Animals {
	TIGER("EL_TIGRE"),
	LION("LIONO"),
	GIRAFFE("DR_LONG_NECK");
	
	private final String animal;
	
	Animals(final String animal) 
	{
		this.animal = animal;
	}
	
	@Override
	public String toString()
	{
		return animal;
	}
}
