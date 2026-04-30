import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int found = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            System.out.println(target + " found at index " + found);
        } else {
            System.out.println(target + " not found in array");
        }

        sc.close();
    }
}