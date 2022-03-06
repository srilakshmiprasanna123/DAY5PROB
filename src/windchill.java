public class windchill {
    public static void main(String[] args) {
        double t = (args.length > 0) ? Double.parseDouble(args[0]): 20;
        double v = (args.length > 0) ? Double.parseDouble(args[1]): 40;
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
    }
}
