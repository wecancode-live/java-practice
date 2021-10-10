package in.balamt.practice.designpattern.adapter;

public class VLC implements PlayList {
	@Override
	public void playFile(String file) {
		System.out.println("Playing Playlist VLC File " + file);
	}
}
