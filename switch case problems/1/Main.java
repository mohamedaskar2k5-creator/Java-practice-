import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x=a.nextInt();
        char c=a.next().charAt(0);
        switch(c){
            case '+':
            System.out.println(x+b);
            break;
            case '-':
            System.out.println(x-b);
            break;
            case '/':
            System.out.println(x/b);
            break;
            case '*':
            System.out.println(x*b);
            break;
        }
    }
         
}