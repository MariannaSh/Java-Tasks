public class Clakulator {
//В статическом методе нет доступа к нестатическим членам класса напрямую через this. 
//Таким образом, использование this.x и this.y внутри статического метода вызовет ошибку компиляции.

    static int numberOfElements(int x, int y){
        int count=0;
        for (int i= x; i<=y; i++){ //первое значение for i от какого числа, второе i до какого
            count++; //count+=1 the same as count++
        }
        return count;
    }

    static int sum(int x, int y){
        int summa=0;
        for (int i=x; i<=y;i++){
            summa+=i;
        }
        return summa;
    }

    

    public static void main(String[] args) {
        System.out.println(numberOfElements(5, 10));
        System.out.println(sum(5, 10));
        System.out.println(sum(5,10)/numberOfElements(5, 10));
    }
}
