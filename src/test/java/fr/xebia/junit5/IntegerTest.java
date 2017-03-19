package fr.xebia.junit5;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerTest {

    @Test
    @Ignore("This test is ignored...")
    public void testSum() {
        // Given
        int a = 2;
        int b = 3;

        // When
        int result = Integer.sum(a, b);

        // Then
        assertEquals("Should be equals", a + b, result);
    }

}
