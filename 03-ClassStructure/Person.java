public class Person {
    String name;
    float weight;
    int height;
    float bmi;

    public Person(String name, float weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    void setWeightAndHeight(float weight,int height){
        this.height=height;
        this.weight=weight;
    }

    public String calculateBMI(){
        float heightMeters = height/100f;
        float bmi = weight/(heightMeters*heightMeters);
        this.bmi = bmi;
        if (18.5f<bmi && bmi<24.9f){
            return "Correct bmi";
        }else if (bmi>24.9f){
            return "BMI too hight";
        }else{
            return "BMI too low";
        }
    }

    public String displayRecord(){
        return "Name: "+name+"\nWeight: "+weight+"\nHeight: "+height+"\nBMI: "+bmi;
    }

    public static void main(String[] args) {
        Person p1=new Person("Marya", 55, 158);
        p1.setWeightAndHeight(46, 158);
        System.out.println(p1.calculateBMI());
        System.out.println(p1.displayRecord());
    }

}
