import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int current=a.nextInt();
        int withdraw=a.nextInt();
        if(withdraw<=current){
            System.out.println(withdraw*100);
        }
            else {
                System.out.println("its invalid");
            }
    }
}