import java.util.Scanner;

public class pro5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 : ");
        int num= scan.nextInt();

        System.out.print(num+" : ");

        while(num>=1){
            System.out.print(num%2);
            num=num/2;
        }
    }
}
