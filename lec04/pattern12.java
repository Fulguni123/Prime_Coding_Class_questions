import java.util.Scanner;

class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int leftStar = n;
        int rightStar = n;
        int space = 1;

        for (int row = 1; row <= n; row++) {

            for (int i = 1; i <= leftStar; i++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("    ");
            }

            for (int k = 1; k <= rightStar; k++) {
                System.out.print("* ");
            }

            System.out.println();
            leftStar--;
            rightStar--;
            space++;
        }
    }
}
