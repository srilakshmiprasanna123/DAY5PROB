package power1.java;

import java.util.Scanner;

public class power1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
                System.out.println("Enter any number");
                int n=sc.nextInt();
                Power(n);
    }
    static void Power(int n)
    {
    if(0<=n && n < 31)
    {
        int pow=1;
        for(int i=0; i<=n; i++)
        {
            System.out.println("2^"+i+" "+pow);
            pow=2*pow;
        }
    }
    }
}

