import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        double a,b;
        double result=0;
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("두 실수를 입력하세요 : ");
        a=scan.nextDouble();
        b=scan.nextDouble();
        num=scan.nextInt();

        if(num==1){
            System.out.println("(1) +, (2) -, (3) *, (4) / : ");
            result=a+b;
            System.out.println("덧셈 결과는 "+result+"입니다.");

        }
        else if(num==2){
            System.out.println("(1) +, (2) -, (3) *, (4) / : ");
            result=a-b;
            System.out.println("뺄셈 결과는 "+result+"입니다.");

        }
        else if(num==3){
            System.out.println("(1) +, (2) -, (3) *, (4) / : ");
            result=a*b;
            System.out.println("곱셈 결과는 "+result+"입니다.");

        }
        else if(num==4){
            System.out.println("(1) +, (2) -, (3) *, (4) / : ");
            result=a/b;
            System.out.println("나눗셈 결과는 "+result+"입니다.");

        }



    }
}
