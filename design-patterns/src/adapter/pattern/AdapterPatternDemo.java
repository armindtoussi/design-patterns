package adapter.pattern;

/**
 * AdapterPattern Demo class. 
 * We just test multiple different media types to see 
 * that we've bridged the gap between mp3's and other audio types that 
 * this program supports. 
 * 
 * 
 * The adapter pattern is a structural pattern.
 * The goal is to combine the capability of two independent interfaces 
 * by bridging the gap using this pattern. 
 * 
 * @author armin
 *
 */
public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "Jurassic Park.vlc");
		audioPlayer.play("avi", "dont mind me.avi");
	}
}
