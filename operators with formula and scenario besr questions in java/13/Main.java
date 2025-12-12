import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double l=a.nextDouble();
        double b=a.nextDouble();
        double h=a.nextDouble();
        double v=l*b*h;
        double sa=2*(l*b+b*h+h*l);
        System.out.println("surface area:"+sa+"\nvolume:"+v);
    }
}
