package adapter.pattern;

/**
 * This is the basic MediaPlayer interface. 
 * This is a mock for a media player interface that allows 
 * interface between audioplayer and media adapter. 
 * 
 * @author armin2
 *
 */
public interface MediaPlayer {
	public void play(String audioType, String filename);
}
