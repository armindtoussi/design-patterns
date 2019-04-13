package adapter.pattern;

/**
 * Adapter class that implements the media player interface.
 * We have an advancedMediaPlayer as a member of this class which 
 * allows us to construct a mediaAdapter object that creates a vlc or mp4 
 * object based on our needs. and the interface method is implemented 
 * to "play()". 
 * 
 * This class is really where the magic happens. This is the layer in between
 * the normal audio player and the advanced media players. 
 * 
 * 
 * @author armin2
 *
 */
public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType)
	{
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String filename) 
	{
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(filename);
		} else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(filename);
		}
	}
}
