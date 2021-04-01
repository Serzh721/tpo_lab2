package functions.trigonometric;

import static java.lang.Double.NaN;

public class Cotangens {
    Tangens tan = new Tangens();

    public double calc(double x, double eps) {
        if (x % Math.PI == 0)
            return NaN;
        return -tan.calc(x + Math.PI / 2, eps);
    }
}