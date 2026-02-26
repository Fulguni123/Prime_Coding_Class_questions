import java.util.Scanner;
public class apseries {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number(a)");
int a=sc.nextInt();
System.out.println("Enter the common difference(d)");
int d=sc.nextInt();
int n=9;
System.out.println("Ap Series");
for(int i=0; i<n; i++){
    System.out.println(a+(n-1)*d);
    a=a+d;
}
    }
}
