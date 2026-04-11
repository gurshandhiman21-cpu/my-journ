import java.util.Scanner;
public class Print_numbers_to_n {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " +num+ ":");
        for(int i=1; i<=num; i++){
            System.out.print(" "+ i + " ");
        }
        sc.close(); 

    }
}  