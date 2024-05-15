public class TestC6 {

    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        if (pages>0){
            this.pages = pages;
        }
    }
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }

    public static void main(String[] args) {
        TestC6 o=new TestC6();
        o.setPages(3);
        o.setPages(-4);
        System.out.println(o.getPages());
    }

    
}