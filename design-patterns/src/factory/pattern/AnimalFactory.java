package factory.pattern;

public class AnimalFactory {
	
	public Animal getAnimal(final String animalType) 
	{
		if(animalType == null)
			return null;
		
		if(animalType.equalsIgnoreCase(Animals.TIGER.toString())) {
			return new Tiger();
		} else if(animalType.equalsIgnoreCase(Animals.LION.toString())) {
			return new Lion();
		} else if(animalType.equalsIgnoreCase(Animals.GIRAFFE.toString())) {
			return new Giraffe();
		}
		
		return null;
	}
}
