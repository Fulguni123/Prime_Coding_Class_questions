import java.util.Scanner;
public class array {
    public static int printArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = printArray(arr);
        if (result != -1) {
            System.out.println("Peak element found at index: " + result);
        } else {
            System.out.println("No peak element found");
        }
    }
}
