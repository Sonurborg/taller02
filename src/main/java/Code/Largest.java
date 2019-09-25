package Code;

import static Code.Main.matrix;

public class Largest {
    
    public static int day;
    public static int hour;
    public static float grade;
    
    public static void find(int dias){
        float temp=matrix[0][0];
        for (int i=0;i<dias;i++) {
            for (int j=0;j<24;j++) {
                if (temp < matrix[i][j]){
                    temp=matrix[i][j];
                    day=i;
                    hour=j;
                    grade=temp;
                }
            }
        }
    }
}
