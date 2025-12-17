import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int div=0;
        for(int i=1;i<=n/i;i++){
            div=n/i;
        }
             if(div*div==n)
         System.out.println("perfect integer");
         else
         System.out.println("not perfect integer");
    }
}