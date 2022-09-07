import java.util.Scanner;

public class pro3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("받은 돈");
        int receive = scan.nextInt();
        System.out.println("상품 가격");
        int price = scan.nextInt();
        System.out.println("부가세"+(int)(price*0.1));
        System.out.println("잔돈 : "+(receive-price));

    }
}
