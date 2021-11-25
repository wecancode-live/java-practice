package in.balamt.practice.designpattern.adapter;

public class MP3 implements Audio {
	private String mediaType;
	@Override
	public void play(String file) {
		System.out.println("Playing " + mediaType() + " " + file);
	}

	@Override
	public String mediaType() {
		return this.mediaType = "MP3";
	}
}
