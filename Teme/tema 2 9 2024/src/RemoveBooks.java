import java.util.List;
import java.util.ArrayList;

public class RemoveBooks {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Programare Java", "Iacob Nicolae Razvan", 30));
        books.add(new Book("Programare Java Script", "Alex Mateescu", 20));

        removeBooksByAuthor(books, "Alex Mateescu");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void removeBooksByAuthor(List<Book> books, String author) {
        books.removeIf(book -> book.author.equals(author));
    }
}
