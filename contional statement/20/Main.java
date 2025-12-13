import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char a=input.next().charAt(0);
        int b=(int)a;
        if(b%2==0){
          System.out.println("even");
        }        
        
        else{
            System.out.println("odd");
        }
    }
}