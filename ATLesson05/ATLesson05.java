
//interface is like a class, but is doesn't implement anything. 
//tells you what functions you have to have. functions you have to provide. doesn't tell you how the functions work
interface Bicycle {
    public int getBooks();
    public double isBagOpen();

    public void openBag();
    public void closeBag();

    public void addBook();
    public void loseBook();
}
//------------------------------------------------------

class Backpack {
    final int MAX_BOOKS = 5;
    private int books = 1;
    private boolean isOpen= true;          // this is true if the bag is open.

    public int getBooks() {
        return books;
    }

    public boolean isBagOpen() {
        return isOpen;
    }

    public void openBag() {
        isOpen = true;
    }

    public void closeBag() {
        isOpen = false;
    }

    public void addBook() {
        // increase the number of books if possible.
        if (books < MAX_BOOKS) {
            books = books + 1;
        }
    }

    public void losebook() {
        // decrease the number of books if possible.
        if (books > 1) {
            books = books - 1;
        }
    }

}

public class ATLesson05 {
    public static void main(String[] args) {
        // create an object using the Bicycle class.
        Backpack theBackpack = new Backpack();

        // what's the initial state?
        System.out.printf("books = %d,", theBackpack.getBooks() );
        if (theBackpack.isBagOpen()) {
            System.out.println(", bag is open.");
        } else {
            System.out.println(" bag is closed.");
        }


        // add a book.
        for(int i = 0; i < 3; i++) {
            System.out.println("adding a book");
            theBackpack.addBook();
            System.out.printf("books = %d,", theBackpack.getBooks());
          if (theBackpack.isBagOpen()) {
            System.out.println(", bag is open.");
        } else {
            System.out.println(" bag is closed.");
        }
        
          
        }
        //closes the bag on this next line of code
        theBackpack.closeBag();
        if (theBackpack.isBagOpen()) {
            System.out.println(", bag is open.");
        } else {
            System.out.println(" bag is closed.");
        }
    }
}