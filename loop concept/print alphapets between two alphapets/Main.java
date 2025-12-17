import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		char n=a.next().charAt(0);
		char m=a.next().charAt(0);
		for (char i='A';i<m;i++){
		    char j=i;
		    if(j>'c' && j<'h')
		System.out.print(j);
		}
	}
}