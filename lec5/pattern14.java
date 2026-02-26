import java.util.Scanner;
 public class pattern14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        int space = r-1;
        int star =1;
        int row=1;
        for(int i=1; i<=2*r-1; i++){
            for(int j=1; j<=space ;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<r){
                space--;
                star++;
            }
            else{
                star--;
                space++;
            }
       }
    }
}

