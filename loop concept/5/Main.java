import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int rev=0;
        while(b>0){
            int rem=b%10;
            rev=rev*10+rem;
            b=b/10;
        }
        System.out.println(rev);
    }
}