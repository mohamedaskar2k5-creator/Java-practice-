import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double r=a.nextInt();
        double cir=2*Math.PI*r;
        System.out.println("circumferance of circle: " + cir);
    }
}
