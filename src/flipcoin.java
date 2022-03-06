import java.util.Scanner;

public class flipcoin {

    public static void main(String[] args) {
        int n, h_count = 0, t_count = 0;
        double heads, tails;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter no. of times you want to flip the coin: ");
        n=scan.nextInt();
        for (int j = 0; j < n; j++) {
            double random = Math.random();
            if (random < 0.5)
                t_count++;
            else
                h_count++;
        }

        heads = h_count / (double) n * 100;
        tails = t_count / (double) n * 100;
        System.out.println("Percentage of heads: " + heads + "%");
        System.out.println("Percentage of tails: " + tails + "%");


    }
}
