import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int amount=a.nextInt();
        int thous=amount/1000;
        int trem=amount%1000;
        int five=trem/500;
        int frem=amount%500;
        int hun=frem/100;
        int hrem=amount%100;
        System.out.println("1000 rs notes:"+thous+"\n500 rs notes:"+five+"\n100 rs notes:"+hun);
    }
}