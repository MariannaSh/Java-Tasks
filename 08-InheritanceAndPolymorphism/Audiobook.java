class Audiobook extends Book{
    private int minutes;
    private int seconds;

    public Audiobook(String name, String city, String title, Writer author, int year, int minutes, int seconds) {
        super(name, city, title, author, year);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Mutator methods
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Duration: " + minutes + " minutes " + seconds + " seconds");
        System.out.println();
    }

    // public static void main(String[] args) {
    //     // Creating one Book object and two Audiobook objects
    //     Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
    //     Audiobook audiobook1 = new Audiobook("To Kill a Mockingbird", "Harper Lee", 10, 30);
    //     Audiobook audiobook2 = new Audiobook("1984", "George Orwell", 8, 45);

    //     // Displaying information about the book and audiobooks
    //     System.out.println("Book:");
    //     book.display();

    //     System.out.println("Audiobook 1:");
    //     audiobook1.display();

    //     System.out.println("Audiobook 2:");
    //     audiobook2.display();
    // }

}
