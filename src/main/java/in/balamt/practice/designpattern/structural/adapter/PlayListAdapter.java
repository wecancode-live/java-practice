package in.balamt.practice.designpattern.structural.adapter;

public class PlayListAdapter implements MediaPlayer {

	PlayList playList;

	//Constructor to get anytype of PlayList
	public PlayListAdapter(PlayList playList) {
		this.playList = playList; 
	}
	
	@Override
	public void play(String file) {
		//play is not supported by vlc and m4a file, we use this adapter class to do the necessary call.
		// So that it can still play the playlist files.
		System.out.println("Using Adapter ==>");
		playList.playFile(file);
	}
}
