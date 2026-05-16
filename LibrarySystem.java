interface Borrowable {
    void borrowBook(String memberName);
    void returnBook(String memberName);
}
class Book implements Borrowable {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title; this.author = author; this.isAvailable = true;
    }
    public void borrowBook(String memberName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(memberName + " borrowed: " + title);
        } else System.out.println(title + " is not available.");
    }
    public void returnBook(String memberName) {
        isAvailable = true;
        System.out.println(memberName + " returned: " + title);
    }
    void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Java Programming", "James Gosling");

        b1.display(); b2.display();
        System.out.println();
        b1.borrowBook("Gurshan");
        b1.borrowBook("Rahul"); // not available
        b1.display();
        System.out.println();
        b1.returnBook("Gurshan");
        b1.display();
    }
}
