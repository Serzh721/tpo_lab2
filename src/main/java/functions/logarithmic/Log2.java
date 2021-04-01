package functions.logarithmic;

public class Log2 {
    LogN logN = new LogN();

    public double calc(double x, double eps) {
        return logN.calc(x, eps) / logN.calc(2.0, eps);
    }
}