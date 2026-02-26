import java.util.Scanner;
public class evenorodd {
    public static int oddeven (int a){
      if(a%2==0){
        return 1;
      }
      else{
        return 0;
        
      }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int b = oddeven(a);
        if(b==1){
            System.out.print("even");
        }       
        else{
             System.out.print("odd");
        }
    }
}
