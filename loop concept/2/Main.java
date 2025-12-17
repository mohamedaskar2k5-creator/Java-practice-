import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            System.out.println(sum);
        
    }
}