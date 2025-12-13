import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b=a.nextInt();
        if(b%100==0){
            System.out.println("it is century year");
    }
    else{
    System.out.println("not century year");
    }
}
}
