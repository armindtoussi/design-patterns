package adapter.pattern;

/**
 * THis audioplayer class is responsible for playing media. 
 * MediaAdapter as a member of this class. 
 * In the play method we pass audioType and filename, and for 
 * fancy media types we use the mediaAdapter to play those(vlc, mp4).
 * 
 * @author armin2
 *
 */
public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	
	@Override 
	public void play(String audioType, String filename)
	{
		//inbuilt support to play mp4 
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("PLaying mp3 file. Name: " + filename);
		} else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			//MediaAdapter is providing support to play other file formats. 
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType,  filename);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}
