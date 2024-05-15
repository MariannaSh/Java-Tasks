public class TestC4 {
    private int[] array;

    public static int even(int[] array){
        int count=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int positiveOdd(int[] array){
        int count=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2!=0 && array[i]>0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,-6,5,8};
        int[] arr2 = {3,2,-5,4,1,-7};
        System.out.println(TestC4.even(arr1));
        System.out.println(TestC4.positiveOdd(arr2));
    }
}
