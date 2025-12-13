import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        String light=a.next();
        String d="red";
        String b="yellow";
        String c="green";
        if(light.equals(d)){
            System.out.println("stop");
        }
            else if(light.equals(b)) {
                System.out.println("ready");
            }
            else if(light.equals(c)){
                System.out.println("Go");
            }
            else{
                System.out.println("invalid");
            }
    }
}