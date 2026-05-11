import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().trim();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        if (str.isEmpty()) {
            count = 0;
        }

        System.out.println("Number of words: " + count);

        sc.close();
    }
}