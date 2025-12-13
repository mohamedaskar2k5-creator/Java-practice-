import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=a*b;
        if(c>0){
          System.out.println("positive");
        }        
        
        else{
            System.out.println("negative");
        }
    }
}