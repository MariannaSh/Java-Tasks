public class Zad {
    private String[] n;

    public Zad(String[] n) {
        this.n = n;
    }

    public boolean m(){
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] == n[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] n1={"uniwersity", "uniwersity","student"};
        Zad z1=new Zad(n1);
        System.out.println(z1.m());
    }
}
