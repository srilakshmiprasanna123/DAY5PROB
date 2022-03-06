import java.util.Scanner;

public class Quntientandreminder {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a dividend num");
            int dividend = scan.nextInt();

            System.out.println("Enter a divisor num");
            int divisor = scan.nextInt();

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
}

