
    import java.util.Scanner;

    public class evenodd {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=scan.nextInt();
            if(n%2==0)
            {
                System.out.println(n+ " is Even Number");
            }
            else
            {
                System.out.println(n+ " is odd Number");
            }
        }
}
