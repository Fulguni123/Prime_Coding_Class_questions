import java.util.Scanner;

class Pattern9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // print spaces
            for (int s = 1; s <= n - i; s++)
                System.out.print("  ");

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
