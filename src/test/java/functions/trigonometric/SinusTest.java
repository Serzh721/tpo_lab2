package functions.trigonometric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SinusTest {
    private static final double eps = 0.00000001;
    private static Sinus sin;

    @BeforeAll
    static void setUp() {
        sin = new Sinus();
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI, -Math.PI / 2, 0.0, Math.PI / 2, Math.PI})
    void check(double val) {
        Assertions.assertEquals(Math.sin(val), sin.calc(val, eps), eps);
    }
}