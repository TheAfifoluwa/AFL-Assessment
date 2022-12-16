import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Question10Test {

    @Test
    void testToSentenceCase() {
        assertEquals("Food is ready. Thank you!", Question10.toSentenceCase("food is ready. thank you!"));
        assertEquals(" .-_/()", Question10.toSentenceCase(" .-_/()"));
    }
}

