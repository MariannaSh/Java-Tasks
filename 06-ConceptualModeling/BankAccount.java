public class BankAccount{
    private int balance;

    
    public BankAccount(int balance) {
        this.balance = balance;
    }


    public void deposite(int deposite){
        balance+=deposite;
    }

    public void withdraw(int deposite){
        if (deposite<=500){
            if(deposite>balance){
                System.out.println("Za duża ilość");
            }
            else{
                balance-=deposite;
            }
        }
        else{
            System.out.println("Za duża ilość");
        }
    }

    public void display(){
        System.out.println("Your current balance is: PLN " + balance);
    }


    public static void main(String[] args) {
        BankAccount ak1=new BankAccount(0);
        ak1.deposite(500);
        ak1.display();
        ak1.deposite(200);
        ak1.display();
        ak1.withdraw(300);
        ak1.display();
        ak1.withdraw(600);
        ak1.display();
    }




    

    
}