import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println("\nCopied array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}