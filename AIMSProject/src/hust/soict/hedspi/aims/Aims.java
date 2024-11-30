package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(87,"The Lion King", "Animation", "Roger Allers",  19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(87,"Star Wars", "Science Fiction", "George Lucas",  24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(90,"Aladin", "Animation", "John Musker",  18.99f);
        cart.addMedia(dvd3);
        cart.removeMedia(dvd2);
        System.out.println("Total cost: " + cart.totalCost());
    }
}
