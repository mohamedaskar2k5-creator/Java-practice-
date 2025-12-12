import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int x1=a.nextInt();
        int y1=a.nextInt();
        int x2=a.nextInt();
        int y2=a.nextInt();
        double d=(Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2))));
        System.out.println("distance:"+d);
    }
}