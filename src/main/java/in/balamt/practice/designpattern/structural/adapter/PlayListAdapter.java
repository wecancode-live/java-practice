package in.balamt.practice.designpattern.structural.adapter;

public class PlayListAdapter implements MediaPlayer {

	PlayList playList;

	//Constructor to get anytype of PlayList
	public PlayListAdapter(PlayList playList) {
		this.playList = playList; 
	}
	
	@Override
	public void play(String file) {
		System.out.println("Using Adapter ==>");
		playList.playFile(file);
	}
}
