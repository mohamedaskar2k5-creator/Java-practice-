import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int battery=a.nextInt();
        if(battery>0 && battery<=49 ){
            System.out.println("low battery");
        }
            else if(battery==50) {
                System.out.println("50% consumed");
            }
            else{
                System.out.println("high battery");
            }
    }
}