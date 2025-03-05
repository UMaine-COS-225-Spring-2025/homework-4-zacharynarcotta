public class Book {
    public String title;
    public String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + "   ";
    }
}