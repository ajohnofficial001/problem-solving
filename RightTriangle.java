public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int hyp = Math.max(a, Math.max(b, c));
        int opp = Math.min(a, Math.min(b, c));
        int adj = a + b + c - hyp - opp;
        boolean ispositivehyp = hyp>0;
        boolean ispositiveopp = opp>0;
        boolean ispositiveadj = adj>0;
        boolean isRightTriangle = Math.pow(hyp, 2) == Math.pow(opp, 2) + Math.pow(adj, 2);
        boolean result = ispositivehyp && ispositiveopp && ispositiveadj && isRightTriangle;
        System.out.println(result);
    }
}
