/*import java.util.Scanner;
public class primeno{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
    int n= sc.nextInt();
    int prime=1;
    for(int i=2; i<=n; i++){
        if(n%2==0){
           prime=0;
           break;
        }
    }
        if(prime==1){
            System.out.println("Prime no");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
    */
   import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("Prime number");
        else
            System.out.println("Not prime number");
    }
}
