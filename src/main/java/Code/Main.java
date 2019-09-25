package Code;

import java.util.Random;

public class Main {
    
    static Random r= new Random();
    static int dias;
    static float[][] matrix;
    
    public static void main(String[]Args){
        summonMatrix();
        menu();
    }
    
    public static void summonMatrix() {
        System.out.println("Favor ingresar la cantidad de días a estudiar");
        dias=IntInputReader.input(1,31);
        matrix=new float[dias][24];
        fillMatrix();
    }
    
    public static void fillMatrix() {
        for (int i=0;i<dias;i++) {
            for (int j=0;j<24;j++) {
                matrix[i][j]=randomRichter();
            }
        }
    }
    
    public static float randomRichter(){
        float dec = r.nextFloat();
        int grade = 1+r.nextInt(9);
        if ( (grade+dec) > 9.5f) {
            return 9.5f;
        }
        return (float)(grade+dec);
    }
    
    private static void menu(){
        int selection;
        do {
           selection=optionSel();
           options(selection);
        }while (selection!=3);
    }
    
    private static int optionSel() {
        System.out.println("Seleccione lo que desea realizar");
        System.out.println(" 1 - Mostrar Mayor Sismo");
        System.out.println(" 2 - Sismos Mayores a 4.0 por día");
        System.out.println(" 3 - Salir");
        return IntInputReader.input(1, 3);
    }
    
    public static void showLargest(){
        Largest.find(dias);
        System.out.println("Día :"+(Largest.day+1));
        System.out.println("Hora :"+Largest.hour);
        System.out.println("Intensidad :"+Largest.grade);
    }
    
    public static void aboveFour(){
        for (int i=0;i<dias;i++) {
            System.out.println("Día "+(i+1)+": "+aboveCounter(i));
        }
    }
    
    public static int aboveCounter(int day){
        int c=0;
        for (int i=0;i<24;i++) {
            if (matrix[day][i] >= 4f) {
                c++;
            }
        }
        return c;
    }
    
    public static void options(int o){
        if (o==1) showLargest(); //option 1
        if (o==2) aboveFour(); //option 2
    }
}
