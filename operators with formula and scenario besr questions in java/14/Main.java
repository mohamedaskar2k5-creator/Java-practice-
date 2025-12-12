import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double r=a.nextDouble();
        double sa=4*Math.PI*Math.pow(r,2);
        double v=(4.0/3.0)*Math.PI*Math.pow(r,3);
        System.out.println("surface area:"+sa+"\nvolume:"+v);
    }
}