import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
        int scoreArray[]={83, 90, 95, 88, 72};
        int max=0;
        String score=null;

        for(int i=0;i<scoreArray.length;i++){
            if(max<scoreArray[i]) {
                max = scoreArray[i];
            }
        }

        System.out.println("최댓값은 : " + max);

        for(int i=0;i< scoreArray.length;i++){
            if(scoreArray[i]>=90){
                System.out.println((i+1)+"번째 학생="+"A");
            }
            else if(scoreArray[i]>=80){
                System.out.println((i+1)+"번째 학생="+"B");
            }
            else if(scoreArray[i]>=70) {
                System.out.println((i + 1) + "번째 학생=" + "C");
            }
        }

    }
}
