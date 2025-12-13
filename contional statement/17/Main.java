import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d){
        System.out.println("yes");
        }        
        else{
            System.out.println("no");
        }
    }
}