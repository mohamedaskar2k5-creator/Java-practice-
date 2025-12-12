import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float disper=a.nextFloat();
        float original=a.nextFloat();
        float dis=(disper/100)*original;
        float totdis=original-dis;
        System.out.printf("discount is: %.2f \nfinal price: %.2f",dis,totdis);
        }
}