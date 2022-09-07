import java.util.Scanner;

public class pro4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("키를 입력하세요. ");
        int h = scan.nextInt();
        System.out.print("몸무게를 입럭하세요. ");
        int w = scan.nextInt();

        double s=(h-100)*0.9;

        if (s<h){
            System.out.println("과체중입니다.");
        }
        else{
            System.out.println("정상입니다.");
        }
    }
}
