import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int pas=a.nextInt();
        if(pas<=10 ){
            System.out.println("50rs");
        }
            else if(pas>10 && pas<=15) {
                System.out.println("70rs");
            }
            else{
                System.out.println("100rs");
            }
    }
}