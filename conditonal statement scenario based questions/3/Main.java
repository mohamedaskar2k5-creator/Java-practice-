import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        if(age>=60){
            System.out.println("eligible for senior citizen");
        }
            else {
                System.out.println("not eligible for senior citizen");
            }
    }
}