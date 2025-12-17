import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int m=a.nextInt();
		int result =1;
		for (int i=1;i<=m;i++){
		    result=result*n;
		}
		System.out.println(result);
	}
}