import java.util.Scanner;
public class arr{
    public void check(int []arr) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr [0];
        int min=arr [0];
        for(int i=0; i<n; i++){
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
        }
           System.out.println("max: "+max+ ",min:"+min);
           for(int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
           }
        }
           public static void main(String[]args){
            arr obj=new arr();
            int[]array=new int[5];
            obj.check(array);
           }
    }    



