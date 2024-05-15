

public class Alphabet {
    static boolean isAlphabet(String t){

        t=t.toLowerCase();

        for (int i = 1; i < t.length(); i++) {
           char przedi = t.charAt(i-1); //char исп для представления отдельного исмвола
           char jesti = t.charAt(i);

            if (jesti<przedi){
                return false;
            }
        }
        return true;
            
        }

        public static void main(String[] args) {
            System.out.println(isAlphabet("absdnsk"));
            System.out.println(isAlphabet("abcd"));
            System.out.println(isAlphabet("abegsw"));
        }

}

