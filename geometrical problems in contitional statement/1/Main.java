import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();

        if(num1==num2 && num2==num3) {
            System.out.println("it is Equilateral");
        }
      
        else if(num1==num2 || num2==num3 || num1==num3) {
            System.out.println("it is Isosceles");
        }
        else{
            System.out.println("it is Scalene");
        }
    }
}
