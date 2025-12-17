import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		char n=a.next().charAt(0);
		char m=a.next().charAt(0);
		System.out.print("vowels"+" ");
		for (char i='A';i<'Z';i++){
		    char j=i;
		    char k=i;
		    if(j=='A' || j=='E' || j=='I' || j=='I' || j=='O' || j=='U')
		System.out.print(j+" ");
		}
		System.out.print("\nconsonats"+" ");
		for (char i='A';i<'Z';i++){
		System.out.print(i+" ");
		}
	}
}