package pro.sky.homework212.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.homework212.calculator.exception.MyIllegalArgumentException;

import java.util.Objects;

@Service
public class ServiceCalculator {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public Float plus(Float a, Float b) {
        return a + b;
    }

    public Float minus(Float a, Float b) {
        return a - b;
    }

    public Float multiply(Float a, Float b) {
        return a * b;
    }

    public String divide(Float a, Float b) throws MyIllegalArgumentException {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Неправильно переданы параметры!";
        }
        if (b == 0) {
            throw new MyIllegalArgumentException("Ошибка! На ноль делить нельзя!");
        } else {
            return a + " / " + b + " = " + a / b;
        }
    }
}
