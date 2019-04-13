package adapter.pattern;

/**
 * Concrete class implements advancedmediaplayer interface. 
 * This is for mp4 playing. It will implement the playmp4 method but not 
 * the playvlc method. 
 * 
 * @author armin2
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {
	
	@Override
	public void playVlc(String filename)
	{
		//do nada. 
	}
	
	@Override
	public void playMp4(String filename)
	{
		System.out.println("Playing mp4 file. Name: " + filename);
	}
}
