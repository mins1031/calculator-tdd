package calculator.input;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputParserTest {

    @Test
    void plusInputCommandTest() {
        //given
        String command = "2 + 3 + 4";
        //when
        int result = InputParser.inputCommand(command);
        //then
        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    void minusInputCommandTest() {
        //given
        String command = "9 - 3 - 4";
        //when
        int result = InputParser.inputCommand(command);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }
}