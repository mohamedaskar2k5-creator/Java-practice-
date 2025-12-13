import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float d=a.nextFloat();
        float b=a.nextFloat();
        float c=a.nextFloat();
        float total=d+b+c;
        float each=total/3;
        System.out.printf("for each:"+each);
        }
}