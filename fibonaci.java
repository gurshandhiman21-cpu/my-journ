import java.util.Scanner;
public class fibonaci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " +num+ ":");
        for(int i=0; i<num; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
    
}
