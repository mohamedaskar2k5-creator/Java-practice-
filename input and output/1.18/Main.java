import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        Scanner c=new Scanner(System.in);
        int d=c.nextInt();
        Scanner e=new Scanner(System.in);
        int f=e.nextInt();
        System.out.printf("%02d/%02d/%04d",b,d,f);
    }
}