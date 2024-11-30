package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    private static int nbDigitalVideoDisc = 0;


    public DigitalVideoDisc(String title) {
        super(title);
        this.id = ++nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category) {
        this(title);
        this.category = category;
    }

    public DigitalVideoDisc(String title, String category, String director) {
        this(title, category);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        this(title, category, director);
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, length);
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

   public int getId() {
       return id;
   }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

   @Override
   public String toString() {
       return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
   }
   public boolean isMatch(String title) {
    return title != null && this.title.equalsIgnoreCase(title);
}
}
