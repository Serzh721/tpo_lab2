import functions.logarithmic.Log2;
import functions.logarithmic.Log3;
import functions.logarithmic.LogN;
import functions.trigonometric.Cosinus;
import functions.trigonometric.Cotangens;
import functions.trigonometric.Tangens;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;

public class Function {

    public double calc(Cosinus cos, Tangens tan, Cotangens cot, LogN lN, Log2 l2, Log3 l3, double x, double eps) {
        if (x < 0 && x % Math.PI != 0) {
            return Math.pow(cot.calc(x, eps), 6) * (cot.calc(x, eps) * tan.calc(x, eps)) / cos.calc(x, eps);
        } else if (x > 0) {
            return Math.pow(Math.pow(l3.calc(x, eps) / l2.calc(x, eps), 2) + l3.calc(x, eps), 2) - lN.calc(x, eps);
        } else
            return NaN;
    }

    public double calc(double x, double eps) {
        Cosinus cos = new Cosinus();
        Tangens tan = new Tangens();
        Cotangens cot = new Cotangens();
        LogN lN = new LogN();
        Log2 l2 = new Log2();
        Log3 l3 = new Log3();

        double result;
        if (x < 0 && x % Math.PI != 0) {
            result = Math.pow(cot.calc(x, eps), 6) * (cot.calc(x, eps) * tan.calc(x, eps)) / cos.calc(x, eps);
        } else if (x > 0) {
            result = Math.pow(Math.pow(l3.calc(x, eps) / l2.calc(x, eps), 2) + l3.calc(x, eps), 2) - lN.calc(x, eps);
        } else
            result = NaN;

        List<String[]> stringArray = new ArrayList<>();
        String[] arr = new String[]{String.valueOf(x), String.valueOf(result)};
        stringArray.add(arr);
        try {
            csvWriter.csvWriterOneByOne(stringArray);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return result;
    }
}
