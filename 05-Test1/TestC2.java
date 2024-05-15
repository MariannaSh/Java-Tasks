public class TestC2 {
    private int value;

    public TestC2(){
        this.value=0;
    }

    public void increase(){
        this.value++;
    }
    public void decrease(){
        this.value--;
    }

    public void increase(int n){
        this.value=this.value+n;
    }
    public void decrease(int n){
        this.value=this.value-n;
    }

    public int value(){
        return this.value;
    }

    public static void main(String[] args) {
        TestC2 o=new TestC2();
        System.out.println(o.value);
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        System.out.println(o.value);
    }

}
