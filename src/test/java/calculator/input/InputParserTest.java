package calculator.input;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputParserTest {

    @Test
    void name() {
        //given
        String command = "2 + 3 * 4";
        //when
        String[] result = InputParser.inputCommand(command);
        //then
        for (int i =0; i< 5; i++){
            System.out.println(command.split(" ")[i]);
        }
        Assertions.assertThat(result).hasSize(3);
    }
}