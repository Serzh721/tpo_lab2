package functions.logarithmic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Log3Test {

    static LogN ln;
    static Log3 l3;
    public final static double eps = 0.0000001;

    @BeforeAll
    public static void setUp() {
        ln = new LogN();
        l3 = new Log3();
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.01, 0.10, 0.5, 0.8, 1.0, 1.5, 3.5, 6.666, 1000.00})
    public void checkPositive(double val) {
        Assertions.assertEquals(Math.log(val) / Math.log(3.0), l3.calc(val, eps), eps * 1000);
    }
    @ParameterizedTest
    @ValueSource(doubles = {-1.0, -20.0002, -1000.00})
    public void checkBad(double val) {
        Assertions.assertEquals(Math.log(val) / Math.log(3.0), l3.calc(val, eps), eps * 1000);
    }
}