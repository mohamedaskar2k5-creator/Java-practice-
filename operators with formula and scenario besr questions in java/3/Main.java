import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int base=a.nextInt();
        int height=a.nextInt();
        double area=((0.5)*base*height);
        System.out.println("The Area of triangle:"+area);
    }
}