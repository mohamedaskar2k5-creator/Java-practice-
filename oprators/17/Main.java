import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a=-5;
	    if(a>0 && (a & (a-1))==0){
	    System.out.println("yes");
	    }
	    else{
	        System.out.println("no");
	    }
	}
}