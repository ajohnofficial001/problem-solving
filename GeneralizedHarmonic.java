public class GeneralizedHarmonic {
    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       int r = Integer.parseInt(args[1]);
       double h = 0;
        for (int i = 1; i <= n; i++) {
             double den = Math.pow(i, r);
            h += 1/den;
        }
        System.out.println(h);
    }
}
