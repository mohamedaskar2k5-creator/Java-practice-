import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        char num = a.next().charAt(0);
        if(num >= '0' && num <= '9') {
            System.out.println("it is digit");
        }
        else if(num>=10) {
            System.out.println("it is not digit");
        }
        else {
            System.out.println("it is more than single digit");
        }
    }
}
