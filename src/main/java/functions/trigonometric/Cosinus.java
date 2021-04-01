package functions.trigonometric;

public class Cosinus {
    public double calc(double x, double eps) {
        double res = 0.0;
        double prev_res = Double.MAX_VALUE;

        for (int n = 0; Math.abs(res - prev_res) > eps; n++) {
            prev_res = res;
            res += Math.pow(-1, n) * Math.pow(x, 2 * n) / fact(2 * n);
        }
        return res;
    }

    private static double fact(int f) {
        if (f <= 1)
            return 1.0;
        else
            return f * fact(f - 1);
    }
}