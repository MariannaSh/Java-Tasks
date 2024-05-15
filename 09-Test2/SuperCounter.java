public class SuperCounter extends Counter {

    SuperCounter(int c) {
        super(c);
    }

    

    public void addN(int n){
        if(n>0){
            for (int i = 0; i < n; i++) {
                add1(); //counter++; для i=0, i=1,i=2... каждый раз число n увеличивается на 1
            }
        }
    } 

    public static void main(String[] args) {
        SuperCounter s1=new SuperCounter(0);
        s1.addN(5);
        System.out.println(s1.getCounter());
        s1.addN(10);
        System.out.println(s1.getCounter());
    }
    
}