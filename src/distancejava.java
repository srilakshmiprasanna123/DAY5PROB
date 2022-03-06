public class distancejava {

    public static void main(String[] args) {

        int x = (args.length > 0) ? Integer.parseInt(args[0]) : 5;
        int y = (args.length > 0) ? Integer.parseInt(args[1]) : 1;


        double distance = Math.sqrt((x*x) + (y*y));

        System.out.println("Euclidean distance (x, y) to the origin (0, 0) " + distance);
    }
}
