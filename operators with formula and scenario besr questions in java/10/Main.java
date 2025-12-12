import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int c=a.nextInt();
        int d=a.nextInt();
        double per=b+c+d;
        System.out.println("perimeter of triangle:"+per);
    }
}