import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hcf=1;
        int lcm=1;
        int a=sc.nextInt();
        int may=(a>n) ? a:n;
        for(int i=1;i<=may;i++){
            if(n%i==0 && a%i==0)
            hcf=i;
        }
     lcm=(n*a)/hcf;
     System.out.println(lcm);
    }
}