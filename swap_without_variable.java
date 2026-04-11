import java.util.Scanner;
public class swap_without_variable {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
         
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.print("After swapping: a= " +a+ " and b= " +b);
        sc.close();
    }
}
