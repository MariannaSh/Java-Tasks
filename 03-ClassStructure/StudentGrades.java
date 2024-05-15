import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class StudentGrades {
    String studentName;
    double[] grades;

    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public StudentGrades(String name, int numberOfGrades){
        double[] posGrades = {2.0,2.5,3.0,3.5,4.0,4.5,5.0,5.5};
        this.studentName= name;
        // Инициализация массива оценок указанной длины
        this.grades=new double[numberOfGrades];
        Random generator = new Random();
        // Заполнение массива оценок случайными значениями из posGrades
        for(int i=0;i<grades.length;i++) {
             // Генерация случайного индекса из posGrades и присвоение оценки grades[i]
            grades[i]=posGrades[generator.nextInt(posGrades.length)];
        }
    }

    public StudentGrades(String name){
        this.studentName=name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of grades: "); //просто выводит сообщение на консоль
        int numberOfGrades = sc.nextInt(); //считывает целочисленный ввод для количества оценок
        grades = new double[numberOfGrades]; //инициализирует массив равный количеству значений
        System.out.println("Enter a grade:");
        for (int i = 0; i < numberOfGrades; i++) { //для каждой оценки введенной с клавиатуры
            grades[i]=sc.nextDouble(); //считывает с клавиатуры значение и подставляет в нужное место 
        }
        sc.close(); //зфкрытие ввода значений
    }


    public double lowest(){
       
        double min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if(min>grades[i]){
                min=grades[i];
            }
        }
        return min;
    }

    public double highest(){
        double max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if(max<grades[i]){
                max=grades[i];
            }
        }
        return max;
    }

    public int numberOfGrades(){
        int count=0;
        for (int i = 0; i < grades.length; i++) {
            count++;
        }
        return count;
    }

    public double average(){
        double summa=0;
        for (int i = 0; i < grades.length; i++) {
            summa+=grades[i];
        }
        return summa/grades.length;
    }

    public void displayStudent(){
        System.out.println("Student name: "+studentName+"\nlist of grades:"+Arrays.toString(grades)+"\nNumber of grades: "+numberOfGrades()+"\nLowest Grade: "+lowest()+"\nHighest grade: "+highest()+"\nAverage point: "+average());
    }




    public static void main(String[] args) {
        // double[] aGr={3.5,4.5,4.0,2.0,3.5,3.5};
        StudentGrades student1 =new StudentGrades("Amanda", 5);
        student1.displayStudent();
        System.out.println();

        // double[] jGr={2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades student2=new StudentGrades("James", 3);
        student2.displayStudent();

        StudentGrades student3= new StudentGrades("Karolina");
        student3.displayStudent();
        };
}
