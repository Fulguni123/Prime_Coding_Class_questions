import java.util.Scanner;
 public class pattern5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        int space=0;
        int star =n-1;
        int row=1;
       while(row<=n){
       int i=1;      //not working properly
       while(i<=space){
        System.out.println("  ");
        i++;
       }
       int j=1;
       while(j<=star){
        System.out.print("*");
        j++;

       }
       System.out.println();
       space++;
       star--;
       row++;
       }
    }
}