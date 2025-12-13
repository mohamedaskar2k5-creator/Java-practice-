import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("The smallest number is: ");
        if(a<b){
        System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}