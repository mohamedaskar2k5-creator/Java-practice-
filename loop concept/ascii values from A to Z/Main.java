import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
      char b=a.next().charAt(0);
      char c=a.next().charAt(0);
      for (char i='A';i<='Z';i++){
          int d=(int)i;
          System.out.print(d+" ");
      }
    }
}
