public class C4 {
    public int[] array;

    public static int even(int[] array){
        int count=0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 2 ==0){
                count++;
            }
        } 
        return count;
    }

    public static int positiveOdd(int[] array){
        int count=0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 2 !=0 && array[i]>0){
                count++;
            }
        } 
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {2,-6,5,8};
        int[] array2 = {3,2,-5,4,1,-7};
        System.out.println(C4.even(array1));
        System.out.println(C4.positiveOdd(array2));
    }
}

