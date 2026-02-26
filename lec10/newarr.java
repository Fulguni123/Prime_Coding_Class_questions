/*import java.util.Scanner;
public class newarr{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int[]arr=new int [n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
   for(int i=0; i<n; i++){
    int product =1;
    for(int j=0; j<n; j++){
      if(i!=j){
        product=product*arr[j];
      }
    }
    System.out.print(product+ " ");
   }
      }
    }
    */
   import java.util.Scanner;
   public class newarr {
    public static void printProduct(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            System.out.print(product + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printProduct(arr, n);
    }
}

