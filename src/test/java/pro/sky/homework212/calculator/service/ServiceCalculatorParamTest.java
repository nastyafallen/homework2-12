package pro.sky.homework212.calculator.service;

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


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

}