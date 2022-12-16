import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Question9Test {

    @Test
    void testUpperCase() {
        assertEquals("GIRL", (new Question9()).upperCase("girl"));
    }

}

