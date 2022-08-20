package pro.sky.homework212.calculator.service;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.homework212.calculator.service.CalculatorServiceTestConstants.*;

class ServiceCalculatorParamTest {

    private final ServiceCalculator out = new ServiceCalculator();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnSum(float num1, float num2) {
        assertNotNull(out.plus(num1, num2));
        assertEquals(num1 + num2, out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnDifference(float num1, float num2) {
        assertNotNull(out.minus(num1, num2));
        assertEquals(num1 - num2, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnProduct(float num1, float num2) {
        assertNotNull(out.multiply(num1, num2));
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnResultOfDivision(float num1, float num2) {
        String result = (out.divide(num1, num2));
        assertNotNull(out.divide(num1, num2));
        assertFalse(StringUtils.isEmpty(result));
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

}