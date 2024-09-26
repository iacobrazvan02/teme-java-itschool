import java.util.ArrayList;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
    }
}

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Programare Java", "Iacob Nicolae Razvan", 30));
        books.add(new Book("Programare JavaScript", "Alex Mateescu", 20));

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
