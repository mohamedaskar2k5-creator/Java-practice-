import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int speed=a.nextInt();
        if(speed>100 ){
            System.out.println("Over-speeding! Fine imposed");
        }
            
            else{
                System.out.println("Speed is within limit");
            }
    }
}