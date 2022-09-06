public class ArrayApp {
    public static void main(String[] args){
        int scoreArray[][]=
                {
                        {87, 90, 78},
                        {90, 88, 80},
                        {95, 88, 85},
                        {77, 89 ,93}
                };
        for(int i=0;i<scoreArray.length;i++){
            double total=0;
            for(int j=0;j<scoreArray[i].length;j++){
                total=total+scoreArray[i][j];
            }
            System.out.println((i+1)+"번째 학생의 총점 : " +total);
            System.out.println((i+1)+"번째 학생의 평균 : " +total/scoreArray[i].length);
        }
    }


}
