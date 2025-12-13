import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=a%100;
        if(b%3==0){
        System.out.println("the last digit is divisible by 3");
        }        
        else {
            System.out.println("the last digit is not divisible by zero");
        }
    }
}