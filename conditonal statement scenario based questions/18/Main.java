import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int unit=a.nextInt();
        int bill=0;
        if(unit<=1000){
            bill=0;
        }
            else if(unit>1000 && unit<=2000){
                            bill=(unit-1000)*5/1000;

            }
            else {
         bill=10+(unit-3000)*10/1000;
}
                System.out.println(bill);
    }
}