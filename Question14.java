class LibraryItem {
    int id;
    String title;
    private boolean available = true;

    LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void borrow() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void returnItem() {
        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    boolean isAvailable() {
        return available;
    }
}

class Book extends LibraryItem {
    Book(int id, String title) {
        super(id, title);
    }
}

class Magazine extends LibraryItem {
    Magazine(int id, String title) {
        super(id, title);
    }
}

class Newspaper extends LibraryItem {
    Newspaper(int id, String title) {
        super(id, title);
    }
}

public class Question14 {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Basics");
        Magazine magazine = new Magazine(2, "Tech World");
        Newspaper newspaper = new Newspaper(3, "Daily News");

        book.borrow();
        book.borrow();
        System.out.println("Available: " + book.isAvailable());

        book.returnItem();
        System.out.println("Available: " + book.isAvailable());

        magazine.borrow();
        newspaper.borrow();
    }
}