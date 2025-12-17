import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%n==0 && n>1 && n==2 && n==3)|| (n%2!=0 && n%3!=0 && n%4!=0 && n%5!=0 && n%6!=0 && n%7!=0 && n%8!=0 && n%9!=0 && n%10!=0))
             System.out.println("prime");
        else
        System.out.println("not prime");

    }
}