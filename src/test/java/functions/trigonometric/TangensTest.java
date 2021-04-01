package functions.trigonometric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Double.NaN;

class TangensTest {
    private static final double eps = 0.00000001;
    private static Tangens tan;

    @BeforeAll
    static void setUp() {
        tan = new Tangens();
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.5 * Math.PI, 0.5 * Math.PI, 1.5 * Math.PI})
    void checkBounds(double val) {
        Assertions.assertEquals(NaN, tan.calc(val, eps));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2 * Math.PI, -Math.PI, -0.4 * Math.PI, -0.25 * Math.PI, 0.0, 0.25 * Math.PI,
            0.4 * Math.PI, 0.75 * Math.PI, Math.PI, 1.25 * Math.PI, 2 * Math.PI})
    public void checkIn(double val) {
        Assertions.assertEquals(Math.tan(val), tan.calc(val, eps), eps);
    }
}