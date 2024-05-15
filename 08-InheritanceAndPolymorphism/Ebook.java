class Ebook extends Book{
    private String fileName;

    public Ebook(String name, String city, String title, Writer author, int year, String fileName) {
        super(name, city, title, author, year);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("File Name: " + fileName);
        System.out.println();
    }

    
}