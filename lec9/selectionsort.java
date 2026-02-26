
import java.util.Scanner;
public class selectionsort{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of elements:");
        int n=sc.nextInt();
        int []arr= new int[n];
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
         }
        for(int i=0; i<n-1; i++){
            int mn=i;
             for(int j=i+1; j<n; j++){
                if(arr[j]<arr[mn]){
                    mn=j;
                }
            }
                    int temp=arr[i];
                    arr[i]=arr[mn];
                    arr[mn]=temp;
                }
            
             System.out.println("Sorted array: ");
           for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
           }
            }
        }
    
        

