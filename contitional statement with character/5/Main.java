import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        char num1 = a.next().charAt(0);
        char num2 = a.next().charAt(0);

        if(num1==num2) {
            System.out.println("it is equal");
        }
      
        else {
            System.out.println("it is not equal");
        }
    }
}
