import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("it is alphapet");
        }
        else if(ch >= 'a' && ch <= 'z') {
            System.out.println("it is alphapet");
        }
        else {
            System.out.println("it is not alphapet");
        }
    }
}
