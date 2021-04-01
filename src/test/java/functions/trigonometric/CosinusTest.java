package functions.trigonometric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CosinusTest {
    private static final double eps = 0.00000001;
    private static Cosinus cos;

    @BeforeAll
    static void setUp() {
        cos = new Cosinus();
    }

    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI, -Math.PI / 2, 0.0, Math.PI / 2, Math.PI})
    void check(double val) {
        Assertions.assertEquals(Math.cos(val), cos.calc(val, eps), eps);
    }
}