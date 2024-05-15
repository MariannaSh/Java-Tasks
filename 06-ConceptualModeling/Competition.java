// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.Arrays;

public class Competition {
    private int judge1,judge2,judge3,judge4,judge5;
    private int[] grades = new int[]{1, 2, 3, 4, 5};
   

    public Competition() {
    }

    
    public int getJudge1() {
        return judge1;
    }

    public void setJudge1(int judge1) {
        for (int i = 0; i < grades.length; i++) {
            if(judge1==grades[i]){
                this.judge1=judge1;
            }
        }
    }

    public int getJudge2() {
        return judge2;
    }

    public void setJudge2(int judge2) {
        for (int i = 0; i < grades.length; i++) {
            if(judge2==grades[i]){
                this.judge2 = judge2;
            }
        }
    }

    public int getJudge3() {
        return judge3;
    }

    public void setJudge3(int judge3) {
        for (int i = 0; i < grades.length; i++) {
            if(judge3==grades[i]){
                this.judge3 = judge3;
            }
        }
    }

    public int getJudge4() {
        return judge4;
    }

    public void setJudge4(int judge4) {
        for (int i = 0; i < grades.length; i++) {
            if(judge4==grades[i]){
                this.judge4 = judge4;
            }
        }
    }

    public int getJudge5() {
        return judge5;
    }

    public void setJudge5(int judge5) {
        for (int i = 0; i < grades.length; i++) {
            if(judge5==grades[i]){
                this.judge5 = judge5;
            }
        }
    }

    public void score(){
        int[] allJudges = new int[]{
            this.judge1,this.judge2,this.judge3,this.judge4,this.judge5
        };
        int min = Arrays.stream(allJudges).min().getAsInt();
        int max=Arrays.stream(allJudges).max().getAsInt();
        int sum=this.judge1+this.judge2+this.judge3+this.judge4+this.judge5-min-max;
        // int len= allJudges.length;
        int arithmetic=sum/3;
        System.out.println("Arithmethic mean= "+arithmetic);

    }

    public static void main(String[] args) {
        Competition score1=new Competition();
        score1.setJudge1(2);
        score1.setJudge2(1);
        score1.setJudge3(3);
        score1.setJudge4(4);
        score1.setJudge5(5);
        score1.score();
    }




    

    
}
