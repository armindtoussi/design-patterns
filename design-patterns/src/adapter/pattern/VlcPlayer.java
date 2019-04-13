package adapter.pattern;

/**
 * Concrete class implements advancedmediaplayer interface. 
 * This is for vlc playing. It will implement the playvlc method but not 
 * the play mp4 method. 
 * 
 * 
 * @author armin2
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	
	@Override 
	public void playVlc(String filename) 
	{
		System.out.println("Playing vlc file. Name: " + filename);
	}
	
	@Override
	public void playMp4(String filename)
	{
		//do nothing ? 
	}
}
