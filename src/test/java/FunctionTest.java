import functions.logarithmic.Log2;
import functions.logarithmic.Log3;
import functions.logarithmic.LogN;
import functions.trigonometric.Cosinus;
import functions.trigonometric.Cotangens;
import functions.trigonometric.Tangens;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class FunctionTest {
    private static final double eps = 0.0000000001;

    static Function functionMock;
    static Function function;
    static Cosinus cosMock;
    static Tangens tanMock;
    static Cotangens cotMock;
    static LogN lNMock;
    static Log2 l2Mock;
    static Log3 l3Mock;

    @BeforeAll
    static void setUp() {
        cosMock = Mockito.mock(Cosinus.class);
        tanMock = Mockito.mock(Tangens.class);
        cotMock = Mockito.mock(Cotangens.class);
        lNMock = Mockito.mock(LogN.class);
        l2Mock = Mockito.mock(Log2.class);
        l3Mock = Mockito.mock(Log3.class);
        functionMock = new Function();
        function = new Function();
    }

    @ParameterizedTest
    @ValueSource(doubles = {-20.0, -19.9999, -15.0, -10.00001, -4.712388, -1.570796, -0.5, -0.18})
    void checkNegative(double val) {
        when(cosMock.calc(val, eps)).thenReturn(Math.cos(val));
        when(tanMock.calc(val, eps)).thenReturn(Math.tan(val));
        when(cotMock.calc(val, eps)).thenReturn(1.0 / Math.tan(val));
        when(lNMock.calc(val, eps)).thenReturn(Math.log(val));
        when(l2Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(2));
        when(l3Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(3));
        Assertions.assertEquals(functionMock.calc(cosMock, tanMock, cotMock, lNMock, l2Mock, l3Mock, val, eps), function.calc(val, eps), eps * 100);
    }

    @Test
    void checkZero() {
        double val = 0.0;
        when(cosMock.calc(val, eps)).thenReturn(Math.cos(val));
        when(tanMock.calc(val, eps)).thenReturn(Math.tan(val));
        when(cotMock.calc(val, eps)).thenReturn(1.0 / Math.tan(val));
        when(lNMock.calc(val, eps)).thenReturn(Math.log(val));
        when(l2Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(2));
        when(l3Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(3));
        Assertions.assertEquals(functionMock.calc(cosMock, tanMock, cotMock, lNMock, l2Mock, l3Mock, val, eps), function.calc(val, eps), eps * 100);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1, 0.5, 1.1111, 1.180747, 2.00001, 10.0, 50.0})
    void checkPositive(double val) {
        when(cosMock.calc(val, eps)).thenReturn(Math.cos(val));
        when(tanMock.calc(val, eps)).thenReturn(Math.tan(val));
        when(cotMock.calc(val, eps)).thenReturn(1.0 / Math.tan(val));
        when(lNMock.calc(val, eps)).thenReturn(Math.log(val));
        when(l2Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(2));
        when(l3Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(3));
        Assertions.assertEquals(functionMock.calc(cosMock, tanMock, cotMock, lNMock, l2Mock, l3Mock, val, eps), function.calc(val, eps), eps * 1000);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2 * Math.PI, -Math.PI, -0.4 * Math.PI, -0.25 * Math.PI, 0.25 * Math.PI,
            0.4 * Math.PI, 0.5 * Math.PI, 0.75 * Math.PI, Math.PI, 1.25 * Math.PI, 1.5 * Math.PI, 2 * Math.PI})
    void checkRadians(double val) {
        when(cosMock.calc(val, eps)).thenReturn(Math.cos(val));
        when(tanMock.calc(val, eps)).thenReturn(Math.tan(val));
        when(cotMock.calc(val, eps)).thenReturn(1.0 / Math.tan(val));
        when(lNMock.calc(val, eps)).thenReturn(Math.log(val));
        when(l2Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(2));
        when(l3Mock.calc(val, eps)).thenReturn(Math.log(val) / Math.log(3));
        Assertions.assertEquals(functionMock.calc(cosMock, tanMock, cotMock, lNMock, l2Mock, l3Mock, val, eps), function.calc(val, eps), eps * 1000);
    }

}