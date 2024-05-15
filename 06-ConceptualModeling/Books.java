public class Books {
    private String title, author,genre;
    private int currentPage,lenth;

    

    public Books(String title, String author, String genre, int currentPage, int lenth) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.currentPage = currentPage;
        this.lenth = lenth;
    }   

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nGenre:"+genre+"\nCurrent page: "+currentPage+"\nLenth of book"+lenth);
    }

    public static void main(String[] args) {
        Books book1=new Books("Harry Potter", "Juan Rolling", "Fantazy", 0, 230);
        book1.setCurrentPage(19);
        book1.display();
    }
}
