public class Room {
    private int number;
    private int beds;
    private boolean occupied;
    private String guestName;


    public Room(int number) {
        this.number = number;
        this.beds=2;
    }


    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
        this.occupied = false;
        this.guestName = null;
    }

    public void checking(String guestName){ //если комната не занята, то этот метод занимает комнату
        if(!occupied){
// выполняется только если комната не занята, то есть значение occupied=false
            this.guestName=guestName;
            this.occupied=true;
        }
    }

    public void checkOut(){ 
//eckb комната уже заната, значение occupied=true, то этот метод ее освобождает, сбрасывая имя и меняя на false
        if(occupied){
            this.guestName=null;
            this.occupied=false;
        }
    }

    public boolean isOccupied(){
        return occupied;
    }

    public void displayStatus(){
        //System.out.println("Guest name: "+guestName+"\nNumber: "+number+"\nBeds: "+beds+"\nIs occupied: "+occupied);
        System.out.printf("Number: %0d, beds: %d, occupied: %s, guest's name: %s\n", number,beds,occupied? "Yes":"No",guestName);
    }

    public static void main(String[] args) {
        Room[] rooms=new Room[6];
        
        // for (int i = 0; i < 3; i++) {
        //     rooms[i]= new Room(i+1,2);
        // }

        // for (int i = 3; i < 5 ; i++) {
        //     rooms[i]=new Room(i+1,3);
        // }

        // rooms[5]=new Room(6,1)
        
        rooms[0] = new Room(12,1);
        rooms[1] = new Room(13,2);
        rooms[2] = new Room(14,2);
        rooms[3] = new Room(15,2);
        rooms[4] = new Room(16,3);
        rooms[5] = new Room(17,3);

        rooms[0].displayStatus();

    }

    

    
}
