import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArray{
    int[] array;
    int[] array1;
    int[] array2;

    static int even(int[] array){
        int count=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    static int positiveOdd(int[] array){
        int count=0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2!=0 && array[i]>0){
                count++;
            }
        }
        return count;
    }

    static void reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int a=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=a;
        }

        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }

    static boolean compare(int[] array1, int[] array2){
        return Arrays.equals(array1, array2);
    }

    // static int different(int[] array1,int[] array2){
    //     int count = 0;
    //     List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
    //     for(int i=0; i<array1.length; i++){
    //         if(list2.contains(array1[i])){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public static void different(int[]array1,int[]array2){
        List<Integer> results = new ArrayList<Integer>();
        String result="";
        for(int i=0;i<array1.length;i++){
            boolean found=false;
            for(int j=0;j<array2.length;j++){
                if (array1[i]==array2[j]) {
                    found=true;
                    break;
                }
            }
            if(!found){
                results.add(array1[i]);
                int x=array1[i];
                result+=Integer.toString(x)+" ";
            }
        }
        
        // System.out.println(results);
        System.out.println(result);
    }

    static boolean exist(int number, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                return true;
            }
        }
        return false;
    }

    static String secondMax(int[] array){

        int max= Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max2=max;
                max=array[i];
            }else if(array[i]>max2 && max!=max2 ){
                max2 = array[i];
            }
        }
        return max+" "+max2;
    }

    static int lastColumn(int[][] array3){
        int sum=0;
        int lastRow=array3.length-1;
        for (int i = 0; i < array3[lastRow].length; i++) {
            sum+=array3[lastRow][i];
        }
        return sum;
    }

    static void swap(int[][] array) {
        int[] temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] two2one(int[][] arra3){
        int[] oneD=new int[arra3.length*arra3[0].length]; //Создается новый одномерный массив с именем oneDArray, размер которого равен произведению количества строк и столбцов входного двумерного массива.
        int count=0;
        for (int i = 0; i < arra3.length; i++) { //перебирает строки входного двумерного массива
            for (int j = 0; j < arra3[i].length; j++) { //перебирает элементы в текущей строке i 
                oneD[count++]=arra3[i][j];
            }
        }
        return oneD;
    }
    

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {1, 2, 3, 4, 5,9};
        int[] array2 = {1, 2, 4, 5, 6,8};
        int[][] array3 = {{1, 2, 3},{4, 5, 6},{7,8,9}};


        System.out.println(even(array));
        System.out.println(positiveOdd(array));
        reverse(array);
        System.out.println("\n"+compare(array1, array2));
        different(array1, array2);
        System.out.println(exist(7, array2));
        System.out.println(secondMax(array2));
        System.out.println(lastColumn(array3));
        swap(array3);
        System.out.println(Arrays.toString(two2one(array3)));

    }
}