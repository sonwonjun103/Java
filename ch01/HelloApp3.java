import java.util.Scanner;

public class HelloApp3 {
    final static int COUNT=5;
    static String course;

    public static void main(String[] args){
        int koreanMax=0;
        int koreanMin=100;
        int mathMax=0;
        int mathMin=100;
        int koreanSum=0;
        int mathSum=0;
        int koreanScore[]={-1,-1,-1,-1,-1};
        int mathScore[]={-1,-1,-1,-1,-1};

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<COUNT;i++){
            System.out.println((i+1)+"번째 학생의 국어 성적");
            koreanScore[i]=scan.nextInt();
            System.out.println((i+1)+"번째 학생의 수학 성적");
            mathScore[i]=scan.nextInt();
        }
        scan.close();

        for(int i=0;i<COUNT;i++){
            if(koreanScore[i]>koreanMax){
                koreanMax=koreanScore[i];
            }
            if(koreanScore[i]<koreanMin){
                koreanMin=koreanScore[i];
            }
            koreanSum+=koreanScore[i];
        }

        for(int i=0;i<COUNT;i++){
            if(mathScore[i]>mathMax){
                mathMax=mathScore[i];
            }
            if(mathScore[i]<mathMin){
                mathMin=mathScore[i];
            }
            mathSum+=mathScore[i];
        }

        course="국어";
        printScore(course, koreanMax, koreanMin, koreanSum);
        course="수학";
        printScore(course, mathMax, mathMin, mathSum);
    }

    static void printScore(String c, int max, int min, int sum){
        System.out.println();
        System.out.println(c+"최고 점수"+max);
        System.out.println(c+"최저 점수"+min);
        System.out.println(c+"총점"+sum);
        System.out.println(c+"평균"+sum/COUNT);
    }
}
