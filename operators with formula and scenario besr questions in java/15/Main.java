import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double r=a.nextDouble();
        double h=a.nextDouble();
        double v=Math.PI*Math.pow(r,2)*h;
        double sa=2*Math.PI*r*(r+h);
        System.out.println("surface area:"+sa+"\nvolume:"+v);
    }
}