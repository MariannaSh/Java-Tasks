public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }

    public void setHour(int hour) {
        if (0<=hour && hour<=23){
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        if (0<=minute && minute<=59){
            this.minute = minute;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

    public void addMinutes(){
        minute++;
        if(minute==60){
            minute=0;
            hour=(hour+1)%24;
        }
    }
    
    public String toString(){
        return String.format("%02d:%02d", hour, minute);
    }
    public static void main(String[] args) {
        
        Clock time=new Clock(12, 23);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        time.setHour(12 );
        time.setMinute(5);
        time.addMinutes();
        System.out.println(time.toString());

    }
    
}
