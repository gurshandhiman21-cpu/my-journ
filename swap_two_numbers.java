import java.util.Scanner;
public class swap_two_numbers {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Before swapping: a= " +a+ " and b= " +b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping: a= " +a+ " and b= " +b);
    sc.close();
}    
}
