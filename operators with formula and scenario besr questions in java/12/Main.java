import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double b=a.nextDouble();
        double sa=6*Math.pow(b,3);
        double v=Math.pow(b,3);
        double per=12*b;
        System.out.println("surface area:"+sa+"\nvolume:"+v+"\nperimeter:"+per);
    }
}
