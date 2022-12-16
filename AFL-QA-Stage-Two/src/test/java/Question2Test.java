import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class Question2Test {

    @Test
    void testPower() {
        assertEquals(10, (new Question2()).power(10, 1));
        assertEquals(4, (new Question2()).power(2, 2));
        assertEquals(32, (new Question2()).power(2, 5));
        assertEquals(0, (new Question2()).power(0, 1));
    }

    @Test
    void testInvalidPower() {
        assertNotEquals(12, (new Question2()).power(10, 1));
        assertNotEquals(5, (new Question2()).power(2, 2));
        assertNotEquals(600, (new Question2()).power(25, 5));
        assertNotEquals(1, (new Question2()).power(0, 1));
    }
}

