import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName(" 1")
    void fizzBuzzTranslate1() {
        int number=1;
        String expected="mot";
        String result= FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected,result);
    }
}