package functions.logarithmic;

import static java.lang.Double.NaN;

public class LogN {
    public double calc(double x, double eps) {

        if (x <= 0)
            return NaN;

        double arg = (x - 1) / (x + 1);
        double result, prevResult;
        result = arg;
        prevResult = Double.MAX_VALUE;
        int k = 3;

        while (Math.abs(result - prevResult) > eps) {
            prevResult = result;
            result += Math.pow(arg, k) / (double) k;
            k += 2;
        }
        return 2 * result;
    }
}