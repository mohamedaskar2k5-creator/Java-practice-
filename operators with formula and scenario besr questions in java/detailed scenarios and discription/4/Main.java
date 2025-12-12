import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float speed=a.nextFloat();
        float time=a.nextFloat();
        float dis=(speed*time);
        System.out.printf("distance: %.2f",dis);
        }
}