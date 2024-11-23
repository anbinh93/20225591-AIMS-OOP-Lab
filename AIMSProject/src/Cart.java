public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
        for (DigitalVideoDisc disc : discs) {
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        addDigitalVideoDisc(disc1);
        addDigitalVideoDisc(disc2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 0) {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i].equals(disc)) {
                    for (int j = i; j < qtyOrdered - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    qtyOrdered--;
                    System.out.println("The disc has been removed.");
                    return;
                }
            }
            System.out.println("The disc is not in the cart.");
        } else {
            System.out.println("The cart is empty.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

  public void printCart() {
       System.out.println("***********************CART***********************");
       System.out.println("Ordered Items:");
       for (int i = 0; i < qtyOrdered; i++) {
           System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
       }
       System.out.println("Total cost: " + totalCost() + " $");
       System.out.println("***************************************************");
   }

   public void searchById(int id) {
       boolean found = false;
       for (int i = 0; i < qtyOrdered; i++) {
           if (itemsOrdered[i].getId() == id) {
               System.out.println(itemsOrdered[i].toString());
               found = true;
           }
       }
       if (!found) {
           System.out.println("No match found for ID: " + id);
       }
   }

   public void searchByTitle(String title) {
       boolean found = false;
       for (int i = 0; i < qtyOrdered; i++) {
           if (itemsOrdered[i].getTitle().equalsIgnoreCase(title)) {
               System.out.println(itemsOrdered[i].toString());
               found = true;
           }
       }
       if (!found) {
           System.out.println("No match found for title: " + title);
       }
   }
}

