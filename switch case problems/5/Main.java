import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int money=a.nextInt();
        if (money==1){
            System.out.println("enter amount for deposit");
        } 
        else if(money==2){
            System.out.println("enter amount for withdraw");
        }
        else if(money==3){
            System.out.println("enter 3 for balance check");
        }
        switch(money){
            case 1:
                int deposit=a.nextInt();
                System.out.println("money successfully deposited");
                break;
                case 2:
                int withdraw=a.nextInt();
                System.out.println("money succesfully withdrawn");
                break;
                case 3:
                int baalnce=a.nextInt();
                System.out.println("yout blance:200rs");
        }
    }
}