import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int mark=a.nextInt();
        switch(mark/25){
        case 0:
            System.out.println("fail");
            break;
            case 1:
                System.out.println("c grade");
                break;
                case 2:
                System.out.println("b grade");
                break;
                case 3:
                    System.out.println("a grade");
        }
    }
}