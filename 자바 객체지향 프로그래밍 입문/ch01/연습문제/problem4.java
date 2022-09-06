import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("학생 수를 입력하세요. ");
        int size=scan.nextInt();
        int sum=0;
        int[] score=new int[size];

        System.out.println("학생 점수를 입력하세요 : ");
        for(int i=0;i<score.length;i++){
            score[i]=scan.nextInt();
            sum+=score[i];
        }

        double avg=sum/size;
        System.out.println("평균 : " + avg);

        for(int i=0;i<score.length;i++){
            if(avg<score[i]){
                System.out.println(score[i] + " fail!");
            }
            else if(avg>score[i]){
                System.out.println(score[i] + " pass!");
            }
        }

    }
}
