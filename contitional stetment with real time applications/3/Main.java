import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b=a.nextInt();
        int cal=b%100;
        int cal1=b/100;
        if(cal==cal1){
            System.out.println("it is equal");
    }
    else{
    System.out.println("not equal");
    }
}
}
