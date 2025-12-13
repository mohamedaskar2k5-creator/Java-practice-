import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char a=input.next().charAt(0);
        if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
          System.out.println("vowels");
        }        
        
        else{
            System.out.println("not vowels");
        }
    }
}