package in.balamt.practice.designpattern.adapter;

public class MP3 implements MediaPlayer {
	@Override
	public void play(String file) {
		System.out.println("Playing MP3 " + file);
	}
}
