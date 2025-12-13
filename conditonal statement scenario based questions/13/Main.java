import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int battery=a.nextInt();
        if(battery>0 && battery<=20 ){
            System.out.println("low");
        }
            else if(battery>21 && battery<=99) {
                System.out.println("moderate");
            }
            else if(battery==100 && battery<=100){
                System.out.println("full");
            }
    }
}