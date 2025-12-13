import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a>99 && a<1000){
        System.out.println("three digit number");
        }

        else {
            System.out.println("not three didgit number");
        }
    }
}