import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cube=sc.nextInt();
        while(cube%3==0){
            cube=cube/3;
        }
        if(cube==1)
            System.out.println("it is power of three");
            else
            System.out.println("it is not power of three");
    }
}