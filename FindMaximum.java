import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Found at index: " + maxIndex);

        sc.close();
    }
}