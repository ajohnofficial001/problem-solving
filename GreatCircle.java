public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371.0;
        double dx = Math.toRadians(x2 - x1);
        double dy = Math.toRadians(y2 - y1);

        double left = Math.sin(dx/2) * Math.sin(dx/2);

        double right = Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.sin(dy/2) * Math.sin(dy/2);
        double a = left + right;
        double distance = 2 * r * Math.asin(Math.sqrt(a));

        System.out.println(distance + " kilometers");

    }
}
