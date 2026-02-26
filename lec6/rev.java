import java.util.Scanner;
public class rev{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
    int n= sc.nextInt();
    int rev=0;
for(int i=1; i<=n; i++)  {
 int r= n%10;
  rev=rev*10+r;
  n/=10;
} 
System.out.println(rev);
}
}