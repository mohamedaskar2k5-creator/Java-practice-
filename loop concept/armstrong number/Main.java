import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
             int a=sc.nextInt();
             int temp=a;
             int count=0;
             int sum=0;
             
             while (temp>0){
                 int rem=temp%10;
                 count++;
                 temp=temp/10;
             }
             temp=a;
             while (temp>0){
                 int rem=temp%10;
                 sum=sum + (int)Math.pow(rem,count);
                 temp=temp/10;
             }
             if(sum==a)
             System.out.println("armstrong number");
             else
             System.out.println("not a armstrong number");
         }
     }
 