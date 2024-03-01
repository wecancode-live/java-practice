package in.balamt.practice.designpattern.structural.adapter;

public class AdapterApp {
	public static void main(String[] args) {
		MediaPlayer player = new MP3();
		player.play("song1.mp3");

		player = new OGG();
		player.play("song4.ogg");
		
		//Using Adapter to create obj for M4A and VLC
		player = new PlayListAdapter(new M4A());
		player.play("song2.m4a");
		
		player = new PlayListAdapter(new VLC());
		player.play("song3.vlc");		
	}
}
