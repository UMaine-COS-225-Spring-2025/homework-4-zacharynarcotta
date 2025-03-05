import java.util.ArrayList;

public class LibraryTester {
    public static void main(String[] args) {
        BookShelf oShelf = new BookShelf();
        oShelf.setFirstLetter('O');
        BookShelf tShelf = new BookShelf();
        tShelf.setFirstLetter('T');
        System.out.println(oShelf + "\n" + tShelf);

        Book heartOfBetrayed = new Book("The Heart of the Betrayed", "Crime");
        Book hillOfStars = new Book("Our Hill of Stars", "Fantasy");
        Book oneOfAKind = new Book("One of a Kind", "Science Fiction");
        Book visionOfRoses = new Book("The Vision of Roses", "Romance");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(heartOfBetrayed);
        books.add(hillOfStars);
        books.add(oneOfAKind);
        books.add(visionOfRoses);
        for(int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        // Attempt to shelf every book on both shelves
        for(int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            oShelf.shelfBook(book);
            tShelf.shelfBook(book);
        }
        System.out.println(oShelf + "\n" + tShelf);
    }
}
