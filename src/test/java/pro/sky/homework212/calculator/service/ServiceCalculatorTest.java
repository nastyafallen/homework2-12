package pro.sky.homework212.calculator.service;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import pro.sky.homework212.calculator.exception.MyIllegalArgumentException;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCalculatorTest {
    private final ServiceCalculator out = new ServiceCalculator();

    @Test
    public void shouldReturnSum() {
        Float result = out.plus(1.25f, 3.00f);
        assertNotNull(result);
        assertTrue(result == 1.25f + 3.00f);
    }

    @Test
    public void shouldReturnSum2() {
        Float result = (out.plus(0.0f, -2f));
        assertNotNull(result);
        assertTrue(result == (0.0f + (-2f)));
    }

    @Test
    public void shouldReturnDifference() {
        Float result = (out.minus(1.25f, 3.00f));
        assertNotNull(result);
        assertTrue(result == 1.25f - 3.00f);
    }

    @Test
    public void shouldReturnDifference2() {
        Float result = (out.minus(0.0f, -2f));
        assertNotNull(result);
        assertTrue(result == 0.0f + 2f);
    }


    @Test
    public void shouldReturnProduct() {
        Float result = (out.multiply(1.25f, 3.00f));
        assertNotNull(result);
        assertTrue(result == 1.25f * 3.00f);
    }

    @Test
    public void shouldReturnProduct2() {
        Float result = (out.multiply(0.0f, -2f));
        assertNotNull(result);
        assertTrue(result == 0.0f * (-2f));
    }

    @Test
    public void shouldReturnResultOfDivision() {
        String result = (out.divide(1.25f, 3.00f));
        assertFalse(StringUtils.isEmpty(result));
    }

    @Test
    public void shouldReturnResultOfDivision2() {
        String result = (out.divide(0.0f, -2f));
        assertFalse(StringUtils.isEmpty(result));
    }

    @Test
    public void shouldThrowExceptionWhenZeroParamInDivision() {
        assertThrows(MyIllegalArgumentException.class, () -> out.divide(1.25f, 0f));
    }

}