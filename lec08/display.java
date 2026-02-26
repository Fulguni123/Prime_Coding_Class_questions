import java.util.Scanner;
public class display {
    public static void display() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        display(arr);
}    
static void display(int[]arr){
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]+ " ");
    }
}
}

