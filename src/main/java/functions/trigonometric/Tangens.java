package functions.trigonometric;

import static java.lang.Double.NaN;

public class Tangens {
    Sinus sin = new Sinus();
    Cosinus cos = new Cosinus();

    public double calc(double x, double eps) {
        if (x % (0.5 * Math.PI) == 0 && (x / (0.5 * Math.PI)) % 2 != 0)
            return NaN;
        return sin.calc(x, eps) / cos.calc(x, eps);
    }
}