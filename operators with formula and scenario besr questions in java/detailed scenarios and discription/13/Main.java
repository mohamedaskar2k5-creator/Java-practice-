import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        // int totalmango=a.nextInt();
        int permano=a.nextInt();
        int buy=a.nextInt();
        int free=buy/3;
        int recieved=buy+free;
        int amount=permano*buy;
        System.out.println("total recived:"+recieved+"\namount to pay:"+amount);
        }
}