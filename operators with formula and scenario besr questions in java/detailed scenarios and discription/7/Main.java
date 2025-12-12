import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int total=a.nextInt();
        int student=a.nextInt();
        int each=total/student;
        int rem=total%each;
        System.out.println("students gets each:"+each+"\nremaing:"+rem);
        }
}