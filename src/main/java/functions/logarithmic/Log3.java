package functions.logarithmic;

public class Log3 {
    LogN logN = new LogN();

    public double calc(double x, double eps) {
        return logN.calc(x, eps) / logN.calc(3.0, eps);
    }
}