
public class FolderFile {
    public static void main(String[] args) {
        File f = new File(79581, "Ala ma kota", "Ala", "C:\\Users\\s-013-24\\Desktop\\pp3");
        Folder folder = new Folder("C:\\Users\\s-013-24\\Desktop", 5446365, null, "Folder_01");
        folder.displayData();
        folder.addFile(f);
        System.out.println(folder.getFile().open());

    }
}
