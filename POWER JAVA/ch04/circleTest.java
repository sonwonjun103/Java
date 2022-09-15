class Circle{
    int radius;
    String color;

    double calcArea(){
        return 3.14*radius*radius;
    }
}

public class circleTest {
    public static void main(String[] args){
        Circle obj; //참조 변수 선언
        obj=new Circle(); // 객체 생성
        obj.radius=100;
        obj.color="blue";
        double area = obj.calcArea();
        System.out.println("원의 면적 = "+area);
    }
}
