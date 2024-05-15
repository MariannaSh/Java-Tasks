
public class BookAndWr {
    public static void main(String[] args) {
        Writer writer = new Writer("Jonh", 1983);
        Book book = new Book("Harry", "FANTASY");

        book.addAuthor(writer);
        System.out.println(book.toString());
        
    }
}
