import java.util.Scanner;
public class factorial_func{
    int fact(int num){
        if(num == 0 || num == 1)
            return 1;
        else
            return num*fact(num-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = new factorial_func().fact(num);
        System.out.print("Factorial of " +num+ " is: " +result);
        sc.close();
        
    }
}

