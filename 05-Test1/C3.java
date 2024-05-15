public class C3 {
    private String t;

    public static boolean isAlphabet(String t){
        for (int i=0;i<t.length()-1; i++){
            if(t.charAt(i)>t.charAt(i+1)){
                return false;
            }
        }
        return true;
        }

    public static String hideText(String t){
        int b=t.substring(1, t.length()-1).length();
        return t.charAt(0)+"*".repeat(b)+t.charAt(t.length()-1);
    }

    //t.charAt(t.length() - 1) возвращает символ, находящийся в последнем индексе строки t.

    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("ok"));
    }
}


