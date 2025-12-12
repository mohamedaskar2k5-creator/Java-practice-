import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int l=a.nextInt();
        int b=a.nextInt();
        double per=2*(l+b);
        System.out.println("perimeter of rectangle:"+per);
    }
}