import java.util.Scanner;

public class pro6 {
    public static void main(String[] args){
        System.out.print("2부터 100사이 모든 소수 ");
        for(int i=2;i<=100;i++){
            int temp=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.print(i + " ");
            }
        }
    }
}
