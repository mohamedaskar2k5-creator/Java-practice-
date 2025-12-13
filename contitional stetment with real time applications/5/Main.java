
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b=a.nextInt();
        if(((b%4==0 && b%100!=0) || b%400==0) && b>0){
            System.out.println("it is  valid year and leap year");
    }
    else if (b>0){
    System.out.println("it it valid year");
    }
    else{
        System.out.println("not valid year");
    }
}
}
