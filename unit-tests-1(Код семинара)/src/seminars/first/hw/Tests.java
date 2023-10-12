package seminars.first.hw;

import seminars.first.Calculator.Calculator;


public class Tests {

    public static void main(String[] args) {

        // Тестим метод получения скидки
        assert 0 < Calculator.calculatingDiscount(1.0, 1);
        assert 0 < Calculator.calculatingDiscount(0.0, 1);
        assert 0 < Calculator.calculatingDiscount(1.0, 0);
        assert 0 < Calculator.calculatingDiscount(1.0, -1);
        assert 0 < Calculator.calculatingDiscount(-1.0, 1);
    }



}

