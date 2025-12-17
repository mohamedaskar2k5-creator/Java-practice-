import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=n*n;
        int sum=0;
        while(pro>0){
        int rem=pro%10;
        pro=pro/10;
        sum=sum+rem;
        }
        
        if(n==sum)
         System.out.println("neon number");
         else
         System.out.println("not neon number");
        }

}