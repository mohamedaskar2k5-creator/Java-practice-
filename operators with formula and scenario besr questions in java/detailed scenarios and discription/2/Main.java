import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float minute=a.nextFloat();
        float second=minute*60;
        System.out.printf("the experiment seconds are: %.2f",second);
        }
}