import java.util.Scanner;

public class HelloApp1 {
	public static void main(String[] args) {
		int year=2015;
		String name;
		Scanner s;
		
		s=new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name=s.next();
		System.out.println("현재 연도를 입력하세요 : ");
		year=s.nextInt();
		
		String hello="Hello";
		System.out.println(hello+name);
		System.out.println("Good luck in "+year);
		s.close();
	}
}
