public class String1 {
    private String text;
    
    public String1(String text){
        this.text=text;
    }

    public int numberOfChacters(){
        return text.length();
    }

    public String first9Characters(){
        return text.substring(0, 9);
    }

    public boolean suffix(){
        if(text.endsWith("day!")){
            return true;
        }
        return false;
    }

    public boolean notEmpty(){
        if(text.isEmpty()){
            return false;
        }
        return true;
    }

    public int lastIndex(){
        return text.lastIndexOf("e");
    }

    public String replacedText(){
        return text.replace(" ", "-");
    }

    public String upperText(){
        return text.toUpperCase();
    }
    public static void main(String[] args) {
        String1 text1=new String1("Have a nice day!");
        System.out.println(text1.numberOfChacters());
        System.out.println(text1.first9Characters());
        System.out.println(text1.suffix());
        System.out.println(text1.notEmpty());
        System.out.println(text1.lastIndex());
        System.out.println(text1.replacedText());
        System.out.println(text1.upperText());
    }
}
