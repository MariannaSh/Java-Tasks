import java.util.ArrayList;

public class Library {
    ArrayList<Book> books= new ArrayList<Book>();

    void addBook(Book book){
        books.add(book); //Book - class, book- nazwa objectu
    }

    void display(){
        System.out.println("Library contain: ");
        int x=1;
        for (Book book:books){
            System.out.println(x);
            book.display();
            x++;
        }   
    }
    
}
