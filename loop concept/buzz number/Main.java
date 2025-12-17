import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           int rem=n%10;
        if(n%7==0 || rem==7)
        System.out.println("buzz number");
        else
        System.out.println("not buzz number");
        }

}