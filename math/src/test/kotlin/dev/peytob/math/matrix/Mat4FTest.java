package dev.peytob.math.matrix;

import org.junit.jupiter.api.Test;

import static dev.peytob.math.matrix.MatricesKt.immutableMat4F;
import static org.junit.jupiter.api.Assertions.*;

class Mat4FTest {

    @Test
    void equalsMethodTest() {
        Mat4 first = immutableMat4F(
            1, 2, 3, 4,
            5, 6, 7, 8,
            9, 0, 1, 2,
            3, 4, 5, 6
        );

        Mat4 second = immutableMat4F(
            1, 2, 3, 4,
            5, 6, 7, 8,
            9, 0, 1, 2,
            3, 4, 5, 6
        );

        assertEquals(first, second);
    }
}