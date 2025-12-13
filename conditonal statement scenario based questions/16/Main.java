import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        long num=a.nextLong();
        if(num>=1000000000L && num>999999999){
            System.out.println("valid number");
        }
            
            else{
                System.out.println("invalid number");
            }
    }
}