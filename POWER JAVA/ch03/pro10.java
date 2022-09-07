import java.util.Scanner;

public class pro10 {
    public static void main(String[] args){
        double sum=0;
        double[] array={1.0, 2.0, 3.0, 4.0};
        for(double value : array){
            sum+=value;
            System.out.print(value+" ");
        }
        double min=0;
        for(int i=0;i< array.length;i++){
            if(min<array[i]){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("합은 "+sum);
        System.out.println("최대값은 "+min);
    }
}
