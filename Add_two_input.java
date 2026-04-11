import java.util.Scanner;

public class Add_two_input {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.print("Sum of " +a+ " and " +b+ " is equal to: " +sum);
        sc.close();



    }
}
