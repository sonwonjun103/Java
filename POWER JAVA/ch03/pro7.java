import java.util.Scanner;

public class pro7 {
    public static void main(String[] args){
        for(int i=1;i<100;i++){
            for(int j=1;j<100;j++){
                for(int z=1;z<100;z++){
                    if(i*i+j*j==z*z){
                        System.out.println(i+" "+j+" "+z);
                    }
                }
            }
        }
    }
}
