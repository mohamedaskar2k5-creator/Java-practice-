import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b;j++){
                if(i==j || i>=b || j>=b)
            System.out.print(  " * ");
            else
            System.out.print("   ");
        }
        System.out.println();
        }
    }
}