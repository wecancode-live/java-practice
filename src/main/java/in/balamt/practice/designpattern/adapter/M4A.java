package in.balamt.practice.designpattern.adapter;

public class M4A implements PlayList {
	@Override
	public void playFile(String file) {
		System.out.println("Playing Playlist M4A File " + file);
	}
}
