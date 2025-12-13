import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char num=input.next().charAt(0);
        if(num>='A' && num<='Z'){
        System.out.println("it is upper case");
        }
        else if(num>='a' && num<='z'){
        System.out.println("it is lower case");
        }
        else if(num<=0 && num>=9){
        System.out.println("it is digit");
        }
        else if(num>=10){
        System.out.println("it is not single digit");
        }
        else {
            System.out.println("it is symbol");
        }
    }
}