public class Book {
    private String title;
    private String genre;
    private Writer author;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }


    public void addAuthor(Writer author){
        this.author=author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Tytul: "+title+"\ngenre: "+genre+"\nWriter name: "+author.getName()+"\nYear: "+author.getbirthYear();
    }
}
