package functions.trigonometric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Double.NaN;

class CotangensTest {
    private static final double eps = 0.00000001;
    private static Cotangens cot;

    @BeforeAll
    static void setUp() {
        cot = new Cotangens();
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2 * Math.PI, -Math.PI, 0.0, Math.PI, 2 * Math.PI})
    void checkBounds(double val) {
        Assertions.assertEquals(NaN, cot.calc(val, eps));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.5 * Math.PI, -0.4 * Math.PI, -0.25 * Math.PI, 0.25 * Math.PI, 0.4 * Math.PI,
            0.5 * Math.PI, 0.75 * Math.PI, 1.25 * Math.PI, 1.5 * Math.PI})
    public void checkIn(double val) {
        Assertions.assertEquals(1.0 / Math.tan(val), cot.calc(val, eps), eps);
    }
}