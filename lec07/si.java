import java.util.Scanner;
public class si {
    public static void SI(int p, int R, int T){
        int s=(p*R*T)/100;
      System.out.println(s);
    }
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter P:");
     int p=sc.nextInt();
     System.out.println("Enter R:");
     int R=sc.nextInt();
     System.out.println("Enter T:");
     int T=sc.nextInt();
     SI(p,R,T);
    }
}
