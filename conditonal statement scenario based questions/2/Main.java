import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        
        if(age>=18){
            System.out.println("eligible for vote");
        }
            else {
                System.out.println("not eligible for vote");
            }
    }
}