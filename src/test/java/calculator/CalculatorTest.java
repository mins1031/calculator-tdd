package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void plusTest() {
        //given
        int currentVal = 120;
        int plusVal = 21;
        //when
        Calculator calculator = new Calculator();
        int plus = calculator.plus(plusVal, currentVal);
        //then
        Assertions.assertThat(plus).isEqualTo(plusVal + currentVal);
    }


}