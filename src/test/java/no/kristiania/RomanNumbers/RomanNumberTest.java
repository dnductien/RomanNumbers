package no.kristiania.RomanNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {
    @Test
     void shouldTransformOneToI() {
        assertEquals("I", toRoman(1));
    }

    private String toRoman(int i) {
        return "";
    }

}
