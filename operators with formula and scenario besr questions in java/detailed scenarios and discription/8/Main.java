import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int cakesper=a.nextInt();
        int hrs=a.nextInt();
        int totalcakes=cakesper*hrs;
        System.out.println("total cakes are:"+totalcakes);
        }
}