import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
      if(x>0 && y>0) {
            System.out.println("first quatrant");
        }
        else if(x<0 && y<0){
            System.out.println("third qudrant");
        }
        else if(x>0 && y<0){
        System.out.println("fourth qudrant");
        }
        else{
        System.out.println("second qudrant");

        }
    }
}
