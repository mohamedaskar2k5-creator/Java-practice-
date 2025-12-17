import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b;j++){
                if((j==2 && i!=1 && i!=5) || ( j==i && j!=1 && i!=1 && j!=b && i!=b) || (i==b-1 && j!=1 && j!=5))
            System.out.print("* ");
            else
            System.out.print("   ");
        }
        System.out.println();
        }
    }
}