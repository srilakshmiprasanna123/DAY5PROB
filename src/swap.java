public class swap {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("--Before Swap---");
        System.out.println("first number "+a);
        System.out.println("second number "+b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("--After Swap--");
        System.out.println("first number "+a);
        System.out.println("second number "+b);

    }
}

