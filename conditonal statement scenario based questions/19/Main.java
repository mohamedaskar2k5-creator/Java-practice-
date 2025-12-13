import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num<=0) {
            System.out.println("data over");
        } else if(num>0 && num<=100) {
            System.out.println("low data");
        }
        else{
            System.out.println("half");
        }
    }
}
