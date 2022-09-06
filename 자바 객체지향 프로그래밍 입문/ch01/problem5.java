import java.util.Scanner;

public class problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rank[]={1,1,1,1,1};
        int[] korean=new int[5];
        int[] math=new int[5];

        for(int i=0;i<5;i++){
            System.out.println((i+1)+"번째 학생의 국어 성적");
            korean[i]=scan.nextInt();
            System.out.println((i+1)+"번째 학생의 수학 성적");
            math[i]=scan.nextInt();
        }

        int koreanmax=0;
        int mathmax=0;

        int koreanmin=100;
        int mathmin=100;

        int koreansum=0;
        int mathsum=0;

        double mathavg=0;
        double koreanavg=0;

        for(int i=0;i<5;i++){
            if(koreanmax<korean[i]){
                koreanmax=korean[i];
            }
            if(koreanmin>korean[i]){
                koreanmin=korean[i];
            }
            koreansum+=korean[i];

            if(mathmax<math[i]){
                mathmax=math[i];
            }
            if(mathmin>math[i]){
                mathmin=math[i];
            }
            mathsum+=math[i];
        }

        System.out.println("국어 최고 점수 "+koreanmax);
        System.out.println("국어 최저 점수 "+koreanmin);
        System.out.println("국어 총점 "+koreansum);
        System.out.println("국어 평균 "+(koreansum/5));

        System.out.println();

        System.out.println("수학 최고 점수 "+mathmax);
        System.out.println("수학 최저 점수 "+mathmin);
        System.out.println("수학 총점 "+mathsum);
        System.out.println("수학 평균 "+(mathsum/5));

        System.out.println();

        int[] stu=new int[5];

        for(int i=0;i<5;i++){
            stu[i]=korean[i]+math[i];
        }

        for(int i=0;i<stu.length;i++){
            for(int j=0;j< stu.length;j++){
                if(stu[i]<stu[j]){
                    rank[i]+=1;
                }
            }
        }

        for(int i=0;i< stu.length;i++){
            System.out.println((i+1)+"번째 학생 총점 " + stu[i] + "석차 : "+rank[i]);
        }
    }
}
