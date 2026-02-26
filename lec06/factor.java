import java.util.Scanner;
public class factor{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter number 1");
    int a= sc.nextInt();
    System.out.println("Enter number 2");
    int b = sc.nextInt();
    System.out.println("Common factors are:");
    while(a%b!=0){       //while(b>0{
      int rem =a%b;      //int rem=a%b;
       a=b;             //a=b;
       b=rem;          //b=rem;
                      //}
    }                 //System.out.println(a);
    System.out.println(b);
}
}