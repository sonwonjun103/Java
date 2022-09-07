import java.util.Scanner;

public class pro4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("구의 반지름 : ");
        double r = scan.nextDouble();
        System.out.println("구의 부피 : "+((4*r*r*r/3)));
    }
}
