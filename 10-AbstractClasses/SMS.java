public class SMS extends Message {
    private User user;

    public SMS(String text, User user) {
        super(text);
        this.user = user;
    }

    @Override
    public void send(){
        System.out.println("SMS sent to: "+"\nUser name i surname:"+user.getName()+" "+user.getLastName()+"\nNumber of user: "+user.getNumber());
        System.out.println("Message: "+ getText());
        System.out.println("Number of characters: "+chartNumber());
    }


}
