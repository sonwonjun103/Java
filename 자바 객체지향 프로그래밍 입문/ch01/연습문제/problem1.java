import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        double r;
        double area;
        System.out.println("원의 반지름을 입력하세요.");
        Scanner scan=new Scanner(System.in);

        r=scan.nextDouble();
        area=r*r*3.14;
        System.out.println("원의 면적은" + area + "입니다.");
    }
}
