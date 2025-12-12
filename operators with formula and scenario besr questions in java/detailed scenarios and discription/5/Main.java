import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float km=a.nextFloat();
        float m=km*1000;
        System.out.printf("distance: %.2f",m);
        }
}