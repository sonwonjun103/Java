import java.util.Scanner;

public class pro9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("출력할 항의 개수 : ");
        int num=scan.nextInt();

        int first=0;
        int second=1;
        System.out.print(first+" ");
        System.out.print(second+" ");
        for(int i=0;i<num-2;i++){
            int sum=first+second;
            first=second;
            second=sum;
            System.out.print(sum+" ");
        }
    }
}
