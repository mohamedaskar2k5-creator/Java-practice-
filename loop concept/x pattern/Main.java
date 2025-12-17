import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b;j++){
                if(j<=b-i) 
            System.out.print("  ");
            else
            System.out.print("* ");
        }
                    for(int j=1;j<=b;j++){
                if(i>j) 
            System.out.print("* ");
            else
            System.out.print("  ");
        }
        System.out.println();
        }
                for(int i=1;i<=b;i++){
            for(int j=1;j<=b;j++){
                if(j<=b-i) 
            System.out.print("* ");
            else
            System.out.print("  ");
        }
                    for(int j=1;j<=b;j++){
                if(i>j) 
            System.out.print("  ");
            else
            System.out.print("*  ");
        }
        System.out.println();
        }

        }
    }