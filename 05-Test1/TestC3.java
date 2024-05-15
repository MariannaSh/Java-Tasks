public class TestC3 {
    private String t;

    public static boolean isAlphabet(String t){
        for (int i=0; i<t.length()-1; i++){
            if (t.charAt(i)>t.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static String hideTest(String t){
        int b=t.substring(1,t.length()-1).length();
        return t.charAt(0)+"*".repeat(b)+t.charAt(t.length()-1);
    }

    public static void main(String[] args) {
        
       System.out.println(TestC3.isAlphabet("abegsw"));
       System.out.println(TestC3.isAlphabet("abcmhsw"));
       System.out.println(TestC3.hideTest("apple"));
       System.out.println(TestC3.hideTest("ok"));
    }
}




