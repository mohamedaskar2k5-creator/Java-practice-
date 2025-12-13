import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a%2==0 || a%5==0){
        System.out.println("yes");
        }        
        else{
            System.out.println("no");
        }
    }
}