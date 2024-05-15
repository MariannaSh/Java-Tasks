public abstract class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public Message(){
        this.text="";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int chartNumber(){
        return text.length();
    }

    public abstract void send();

}
