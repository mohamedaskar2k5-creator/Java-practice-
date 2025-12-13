import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a<10){
          System.out.println("single digit");
        }        
        else if(a>10 && a<100){
            System.out.println("double digits");
        }
        else{
            System.out.println("three digits");
        }
    }
}