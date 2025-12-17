import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0){
        int rem=temp%10;
        temp=temp/10;
        sum=sum+rem;
        }
        if(n%sum==0)
        System.out.println("harshad number");
        else
        System.out.println("not harshad number");
        }

}