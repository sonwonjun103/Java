import java.util.Scanner;

public class pro8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("연산을 입력하세요. ");
        String how = scan.next();
        System.out.println("두 수를 입력하세요");
        int a=scan.nextInt();
        int b=scan.nextInt();

        if(how.equals("+")){
            System.out.println((double)a+"+"+(double)b+" = "+(double)(a+b));
        }
        else if(how.equals("-")){
            System.out.println((double)a+"-"+(double)b+" = "+(double)(a-b));
        }
        else if(how.equals("*")){
            System.out.println((double)a+"*"+(double)b+" = "+(double)(a*b));
        }
        else if(how.equals("/")) {
            if (b == 0) {
                System.out.println("Error");
            } else {
                System.out.println((double) a + "/" + (double) b + " = " + (double) (a / b));
            }
        }
    }
}
