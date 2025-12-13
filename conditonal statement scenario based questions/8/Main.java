import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int fixedpin=a.nextInt();
        int pin=2005;
        if(fixedpin==pin){
            System.out.println("matched");
        }
            else {
                System.out.println("not matched");
            }
    }
}