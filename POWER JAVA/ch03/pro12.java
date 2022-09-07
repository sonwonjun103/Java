import java.util.Scanner;

public class pro12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] grade=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("성적을 입력하세요 : ");
            int stu=scan.nextInt();
            grade[i]=stu;
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=grade[i];
        }

        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+sum/5);

    }
}
