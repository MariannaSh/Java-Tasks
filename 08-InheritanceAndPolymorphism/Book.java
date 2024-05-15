public class Book extends Publisher{
    private String title;
    private Writer author;
    private int year;


    public Book(String name, String city, String title, Writer author, int year) {
        super(name, city);
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getAuthor() {
        return author;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: " + author.getFirstName() + " " + author.getLastName());
        System.out.println("Year: "+year);
        System.out.println();
    }


    
}
