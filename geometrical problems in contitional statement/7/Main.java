import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double x1 = a.nextDouble();
        double y1= a.nextDouble();
        double x2=a.nextDouble();
        double y2=a.nextDouble();
        double ans=(Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));
            System.out.println(ans);
    }
}
