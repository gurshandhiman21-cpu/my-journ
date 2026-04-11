import java.util.Scanner;
public class sum_of_first_n_numbers_without_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of first " + n + " numbers is: " + sum);
        sc.close();
    }
}
