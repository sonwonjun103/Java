import java.util.Scanner;

public class pro1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("오렌지의 개수를 입력하시오 : ");
        int orange=scan.nextInt();

        System.out.println((orange/10)+"박스가 필요하고 "+(orange%10)+"개가 남습니다.");
    }
}
