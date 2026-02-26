import java.util.Scanner;

class Reverse{
    public static void main(String []args){
        int rev=0;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter value of n: ");
   int n = sc.nextInt();
   while(n>0){
    int r  = n%10;
    rev=rev*10+r;
    n/=10;
   }
   System.out.println(rev);
}
}