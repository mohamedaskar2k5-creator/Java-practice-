import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int total=a.nextInt();
        int dis=a.nextInt();
        int fin=total-dis;
        if(total>dis){
            System.out.println("discount is:"+dis+"\nthe final amount is:"+fin);
        }
            else {
                System.out.println("no discount");
            }
    }
}