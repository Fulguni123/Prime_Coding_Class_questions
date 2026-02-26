import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
    int n=sc.nextInt();
    int rev=0;
    while(n>0){
        int r = n%10;
        n=n/=10;
        rev=rev +r;
    }
    System.out.println(rev);
    }
}