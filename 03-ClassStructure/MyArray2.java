import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray2{
    private int[] array;
    private int[] array2;
    
    public MyArray2(int[] array) {
        this.array = array;
    }

    public int even(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public int positiveOdd(int[] array){
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0 && array[i]>0){
                count++;
            }
        }
        return count;
    }

    public void reverce(int[] array){
        int length=array.length;
        int[] reverseArr=new int[length];

        for (int i = 0; i < length; i++) {
            reverseArr[i]=array[length-1-i];
        }
        
        // for (int i: reverseArr){
        //     System.out.print(i+",");
        // }
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i]);

            if (i<reverseArr.length-1){
                System.out.print(",");
            }
        }
    }

    public boolean compare(int[] array,int[] array2){
        return Arrays.equals(array, array2);
    }


    public void different(int[] array,int[] array2){
        List<Integer> result = new ArrayList<>();
        List<Integer> array2List=new ArrayList<>();

        for(int num: array2){
            array2List.add(num);
        }

        for(int num: array){
            if(!array2List.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);

        // for (int i = 0; i < result.size(); i++) {
        //     System.out.print(result.get(i)+" ");
        // }

    }

    public boolean exist(int number,int[] array){
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                return true;
            }
        }
        return false;
    }

    public void secondMax(int[] array){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
    
        for (int i : array) {
            if (i > max) {
                secMax = max;
                max = i;
            } else if (i > secMax && i < max) {
                secMax = i;
            }
        }
        System.out.println(secMax);
        
    }

    public static void main(String[] args) {
        int[] array={2,5,4,6,8,2,-3,9,12};
        int[] array2={-3,2,4,3,5,6,7};
        MyArray2 a1=new MyArray2(array);

        System.out.println(a1.even(array));
        System.out.println(a1.positiveOdd(array2));
        a1.reverce(array2);
        System.out.println();
        System.out.println(a1.compare(array, array2));
        a1.different(array, array2);
        System.out.println(a1.exist(6, array2));
        a1.secondMax(array2);
    }


}