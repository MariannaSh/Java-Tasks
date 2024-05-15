public class Writer {
    private String name;
    private int birthYear;

    public Writer(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Getter and setter methods

    public String getName() {
        return name;
    }

    public int getbirthYear(){
        return birthYear;
    }

    // Other getter and setter methods

    // @Override
    // public String toString() {
    //     return "Writer: [\nname=" + name + "\nbirthYear=" + birthYear +"]";
    // }
}