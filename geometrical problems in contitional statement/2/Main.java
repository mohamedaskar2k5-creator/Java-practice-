import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();
        int mul=num1*num1;
        int mul2=num2*num2;
        int add=mul+mul2;
      if(add==num3*num3) {
            System.out.println("it is right angle triangle");
        }
        else{
            System.out.println("it is not right angle triangle");
        }
    }
}
