package adapter.pattern;

/**
 * AdvancedMediaPlayer interface. This interface is 
 * responsible for playing our "advanced" file types. 
 * 
 * 
 * @author armin2
 *
 */
public interface AdvancedMediaPlayer {
	public void playVlc(String filename);
	public void playMp4(String filename);
}
