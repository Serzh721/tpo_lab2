package functions.trigonometric;

public class Sinus {
    Cosinus cos = new Cosinus();

    public double calc(double x, double eps) {
        return -cos.calc(x + Math.PI / 2, eps);
    }
}