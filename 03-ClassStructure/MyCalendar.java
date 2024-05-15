public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static String myDate(){
        return year+"-"+month+"-"+day;
    }

    static int daysFromBegining(){
        int begining=0;
        switch (month) {
            case 1:
                begining+=day;
                return begining;
            case 2:
                return begining=day+31;
            case 3:
                return begining=day+31+28;
            case 4:
                return begining=day+31+28+31;
            case 5:
                return begining=day+31+28+31+30;
            case 6:
                return begining=day+31+28+31+30+31;
            case 7:
                return begining=day+31+28+31+30+31+30;
            case 8:
                return begining=day+31+28+31+30+31+30+31;
            case 9:
                return begining=day+31+28+31+30+31+30+31+31;
            case 10:
                return begining=day+31+28+31+30+31+30+31+31+30;
            case 11:
                return begining=day+31+28+31+30+31+30+31+31+30+31;
            case 12:
                return begining=day+31+28+31+30+31+30+31+31+30+31+31;
               
            default:
                return 0;
        }
    }

    static String monthName(){
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Fabruary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Octubre";
            case 11:
                return "Novembre";
            case 12:
                return "Deciembre";
            default:
                return "";
        }
   
    }
}
