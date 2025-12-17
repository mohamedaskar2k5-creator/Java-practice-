import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int temp=b;
        int rev=0;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==b)
        System.out.println("it is palindrome number");
        else
        System.out.println("it is not palindrome number");
    }
}