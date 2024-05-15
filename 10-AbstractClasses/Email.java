public class Email extends Message {
    
    private User user;
    private String theme;
    
    public Email(String text, User user,String theme) {
        super(text);
        this.user = user;
        this.theme=theme;
    }

    public void send(){
        System.out.println("Theme: "+theme+"\nAdress: "+user.getEmail()+"\nMessage: "+getText()+"\nLenght: "+chartNumber());
    }
}
