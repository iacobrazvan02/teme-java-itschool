import java.util.ArrayList;
import java.util.List;

public class FilterBooks {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Programare Java", "Iacob Nicolae Razvan", 30));
        books.add(new Book("Programare JavaScript", "Alex Mateescu", 20));

        List<Book> affordableBooks = getBooksByPrice(books, 25.00);
        for (Book book : affordableBooks) {
            System.out.println(book);
        }
    }

    public static List<Book> getBooksByPrice(List<Book> books, double maxPrice) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.price < maxPrice) {
                result.add(book);
            }
        }
        return result;
    }
}

