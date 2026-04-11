import java.util.Scanner;
public class meter_to_inches {
    public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a value in meters: ");
    double meters = sc.nextDouble();

    double inches = meters * 39.3701;

    System.out.println(meters + " meters is equal to " + inches + " inches :");
    sc.close();
    
    }
}
 