package hust.soict.hedspi.aims.media;

public class Track extends Media {
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private String title;
    private int length;

    public Track(String title, int length) {
        super(length, title);
        this.title = title;
        this.length = length;
    }
}
