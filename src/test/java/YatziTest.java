import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {

    @Test
    void TestOne(){

        assertEquals("I", toRoman(1));

    }
    @Test
    void TestTwo(){

        assertEquals("II", toRoman(2));

    }

    private String toRoman(int i) {

        return "I";

    }

}
