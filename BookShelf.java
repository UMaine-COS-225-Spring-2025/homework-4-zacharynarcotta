import java.util.ArrayList;

public class BookShelf {
    private char firstLetter;
    private ArrayList<Book> booksOnShelf = new ArrayList<Book>(8);

    public BookShelf() {}

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public ArrayList<Book> getBooksOnShelf() {
        return booksOnShelf;
    }

    public void setBooksOnShelf(ArrayList<Book> booksOnShelf) {
        this.booksOnShelf = booksOnShelf;
    }

    public void shelfBook(Book book) {
        if(book.title.charAt(0) == this.firstLetter) {
            this.booksOnShelf.add(book);
        }
        else {
            return;
        }
    }

    public void removeBook(Book book) {
        this.booksOnShelf.remove(book);
    }

    @Override
    public String toString() {
        if(this.booksOnShelf.size() == 0) {
            return "Empty";
        }
        else {
            String toPrint = "";
            for(int i = 0; i < this.booksOnShelf.size(); i++) {
                Book book = this.booksOnShelf.get(i);
                toPrint += book.title + "   ";
            }
            return toPrint;
        }
    }
}
