public class BookTest {
    public static void main(String[] args) {
        // Book b1 = new Book("Little Prince", "Krakow", "B1", "Gatsbi", 1839);
        // b1.display();

        // Ebook eb1 = new Ebook("Fabryka Słów","Lublin","The Inheritance Game", "J.L.Barnes", 1231,"the_inheritance_game.epub");
        // eb1.display();
        // eb1.setFileName("The Inheritance Game 2");
        // eb1.display();

        // Audiobook audiobook1 = new Audiobook("Nasza Księgarnia","Kraków","Hobbit - Chapter 1", "J.R.R. Tolkien", 73, 4, 2001);
        // System.out.println("Audiobook 1:");
        // audiobook1.display();
        // audiobook1.setMinutes(100);
        // audiobook1.display();

        Library library = new Library();
        // library.addBook(audiobook1);
        // library.addBook(eb1);
        // library.display();

        Writer author1 = new Writer("F. Scott", "Fitzgerald", "Fiction");
        Book book = new Book("The Great Gatsby", "Krakow", "Book1", author1, 1234);
        Ebook ebook1 = new Ebook("To Kill a Mockingbird", "Warszawa", "Ebook1", author1, 1938, "Electronna Kniga");
        Audiobook audiobook= new Audiobook("The Hobbit", "Kelce", "Audio1", author1, 2009, 100, 32);
        Publisher publisher = new Publisher("Penguin Books", "New York");

        library.addBook(book);
        library.addBook(ebook1);
        library.addBook(audiobook);
        
        library.display();
        publisher.display();

        

    }
}
