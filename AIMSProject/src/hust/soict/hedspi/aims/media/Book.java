package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book extends Media {
    private List<String> author = new ArrayList<String>();


    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }


    public void addAuthor(String authorName) {
        if (author.contains(authorName)) {
            System.out.println("Author already exists");
        }
        author.add(authorName);
        System.out.println("Author added successfully");
    }

    public void removeAuthor(String authorName) {
        if (!author.contains(authorName)) {
            System.out.println("Author does not exist");
        }
        author.remove(authorName);
        System.out.println("Author removed successfully");
    }
}