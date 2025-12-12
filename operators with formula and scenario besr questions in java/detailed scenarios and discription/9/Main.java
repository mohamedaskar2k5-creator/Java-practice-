import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float P=a.nextFloat();
        float R=a.nextFloat();
        float T=a.nextFloat();
        float SI=(P*R*T)/100;
        System.out.println("SI:"+SI);
        }
}