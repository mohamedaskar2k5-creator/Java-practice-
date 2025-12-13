import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        float pur=a.nextInt();
        float fir=pur*(3/4);
        float sec=pur/2;
        float thi=pur/4;
        float sub=pur-thi;
        float sub2=pur-sec;
        float sub3=pur-fir;
        if(pur>=1000){
            System.out.println("the discount is:"+sub);
        }
            else if(pur>=500 && pur<1000) {
                System.out.println("the discount is:"+sub2);
            }
            else{
                System.out.println("no discount"+sub3);
            }
    }
}