import java.util.Scanner;

public class leapyear {
    public static boolean leapYearCheck(int year) {
        if (year > 1000) {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a leap year:");
        int year = scan.nextInt();
        boolean result = leapYearCheck(year);

        if (result) {
            System.out.println("Year:" + year + " is a leap year");
        } else {
            System.out.println("Year:" + year + " is not a leap year");
        }
    }
}
