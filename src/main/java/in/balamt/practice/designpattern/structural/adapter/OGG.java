package in.balamt.practice.designpattern.structural.adapter;

public class OGG implements Audio {
    private String mediaType;
    @Override
    public void play(String file) {
        System.out.println("Playing " + mediaType() + " " + file);
    }

    @Override
    public String mediaType() {
        mediaType = "OGG";
        return mediaType;
    }
}
