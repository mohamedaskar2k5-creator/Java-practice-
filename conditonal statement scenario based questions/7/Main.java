import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int unit=a.nextInt();
        if(unit<100){
            System.out.println("free");
        }
            else if(unit>100 && unit<=300){
                System.out.println(unit*5);
            }
            else {
                System.out.println(unit*10);
            }
    }
}