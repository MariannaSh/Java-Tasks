class Test {
    public static void main(String[] atg){
        int day = 3;
    String dayString;
    switch (day) {
        case 1:  dayString = "Понедельник";
                 break;
        case 2:  dayString = "Вторник";
                 break;
        case 3:  dayString = "Среда";
                 break;
        case 4:  dayString = "Четверг";
                 break;
        case 5:  dayString = "Пятница";
                 break;
        case 6:  dayString = "Суббота";
                 break;
        case 7:  dayString = "Воскресенье";
                 break;
        default: dayString = "Ошибка";
                 break;
    }
    System.out.print(dayString);
    }

    
}
