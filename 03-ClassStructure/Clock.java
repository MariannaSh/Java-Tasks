public class Clock {
    private int hour,minute;
    private int alarmHour,alarmMinute;

    public void setAlarm(int hour, int minute){
        if (hour<24 && hour>=0 && minute>=0 && minute<60){
            this.alarmHour=hour;
            this.alarmMinute=minute;
        }
    }

    public void runAlarm(){
        if(alarmHour==hour && alarmMinute==minute){
            System.out.println("beep-beep-beep-beep !!");
        }
    }

    public Clock(){
        hour=00;
        minute=00;
    }

    public Clock(int hour,int minute){
        if (hour<24 && hour>=0 && minute>=0 && minute<60){
            this.hour=hour;
            this.minute=minute;
        }
    }

    public void setClock(){
        hour=00;
        minute=00;
    }

    public void setClock(int hour,int minute){
        if(hour<24 && hour>=0 && minute>=0 && minute<60){
            this.hour=hour;
            this.minute=minute;
        }
    }

    public void addOneMinute(){
        if (minute<59){
            minute++;
        }else if(hour==23){
            hour=00;
            minute=00;
        }else{
            hour++;
            minute=00;
        }
    }

    public void displayTime(){
        System.out.printf("%02d:%02d\n",hour,minute);
    }
    public static void main(String[] args) {
        Clock time1 = new Clock(12, 47);
        time1.displayTime();
        time1.setClock(18, 14);
        time1.displayTime();
        time1.setClock(9 , 03);
        time1.displayTime();
        time1.setClock(23, 58);
        time1.displayTime();
        time1.addOneMinute();
        time1.displayTime();
        time1.addOneMinute();
        time1.displayTime();
        time1.setAlarm(12, 15);
        time1.runAlarm();
        time1.setClock(12, 14);
        time1.displayTime();
        time1.addOneMinute();
        time1.displayTime();
        time1.runAlarm();
        

    }

    
}
