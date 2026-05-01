import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Found at index: " + minIndex);

        sc.close();
    }
}
