public class File {
    private int size;
    private String content;
    private String fileName;
    private String address;

    public File(int size, String content, String fileName, String address) {
        this.size = size;
        this.content = content;
        this.fileName = fileName;
        this.address = address;
    }

    String open() {
        return content;
    }

    void Rename(String name) {
        this.fileName = name;
    }

    //setters and getters
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
