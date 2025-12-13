import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b && a>c){
        System.out.println(a);
        }
       else if(b>a && b>c){
        System.out.println(a);

        }
        else {
            System.out.println(c);
        }
    }
}