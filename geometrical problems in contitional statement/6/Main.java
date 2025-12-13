import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int z=a.nextInt();
        int w=a.nextInt();
        
      if(x==y && y==x && x==z && y==z && x==w && y==w )  {
            System.out.println("it will form a square");
        }
        else{
        System.out.println("it will not form a square");
        }
    }
}
