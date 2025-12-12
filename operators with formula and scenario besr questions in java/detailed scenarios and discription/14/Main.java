import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int pen=a.nextInt();
        int buy=a.nextInt();
        int rules=pen/5;
        int recieved=rules*3;
        System.out.println("total pens need to pay:"+recieved);
        }
}