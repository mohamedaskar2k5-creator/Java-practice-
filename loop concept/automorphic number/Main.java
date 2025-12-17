import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=n*n;
        int div=pro/n;
        if(div==n)
        System.out.println("autorphic number");
        else
        System.out.println("not automorphic number");
    }
}
    
        