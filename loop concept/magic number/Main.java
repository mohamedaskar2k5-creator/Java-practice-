import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(temp>9){
            int sum=temp;
            temp=0;
            while(sum>0){
                int rem=sum%10;
                temp=temp+rem;
                sum=sum/10;
            }
        }
        if(temp==1)
           System.out.println("magic number");
           else
           System.out.println("not magic number");
    }
}
    
        