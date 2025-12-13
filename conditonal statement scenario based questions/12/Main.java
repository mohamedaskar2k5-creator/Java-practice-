import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        if(b<9){
            System.out.println("cold");
        }
            else if(b>9 && b<=15) {
                System.out.println("pleasant");
            }
            else if(b>15 && b<=20){
                System.out.println("hot");
            }
            else{
                System.out.println("heatwave");
            }
    }
}