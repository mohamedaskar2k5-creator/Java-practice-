import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int temp=b;
        double sum=0;
        double pro=1;
        int count=0;
        while(temp>0){
            int rem=temp%10;
            count++;
            temp=temp/10;
        }
        temp=b;
            while(temp>0){
                int rem=temp%10;
                sum=sum+Math.pow(rem,count);
                temp=temp/10;
            }
        if(sum==b)
        System.out.println("it is armstrong number");
        else
        System.out.println("it is not armstrong number");
    }
}