public class CinemaTicket {
    static String cinemaName = "MultiKino"; //потому что одинаковое для всех билетов
    String title;
    int row;
    int seat;
    float price;

    public CinemaTicket(String title, int row, int seat){
        this.title=title;
        this.row=row;
        this.seat=seat;
        if(row<2){
            this.price=10.00f;
        }else{
            this.price=25.00f;
        }
    }

    public String toString(){
        return "CinemaName: "+cinemaName+"\nTitle: "+title+"\nRow: "+row+"\nSeat: "+seat+"\nPrice: "+price;
    }

    public static void main(String[] args) {
        CinemaTicket cinema1= new CinemaTicket("Harry", 12, 32);
        CinemaTicket cinema2= new CinemaTicket("Harry", 1, 2);

        System.out.println(cinema1.toString()+"\n");
        System.out.println(cinema2.toString());
    }




    
}
