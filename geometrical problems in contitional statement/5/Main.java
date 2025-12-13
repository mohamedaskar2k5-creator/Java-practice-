import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int z=a.nextInt();
        int sum=x+y;
        int sum2=y+z;
        int sum3=x+z;
      if(sum>z && sum2>x && sum>y)  {
            System.out.println("it will form a valid triangle");
        }
        else{
        System.out.println("it will not form a valid triangle");
        }
    }
}
